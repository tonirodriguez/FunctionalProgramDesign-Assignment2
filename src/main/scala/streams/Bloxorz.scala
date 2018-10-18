package streams

/**
 * A main object that can be used to execute the Bloxorz solver
 */
object Bloxorz extends App {

  /**
   * A level constructed using the `InfiniteTerrain` trait which defines
   * the terrain to be valid at every position.
   */
  object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  }

//  println(InfiniteLevel.solution) TODO: TAKE OFF

  /**
   * A simple level constructed using the StringParserTerrain
   */
  abstract class Level extends Solver with StringParserTerrain

  object Level0 extends Level {
    val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
  }

//  println(Level0.solution)  TODO: TAKE OFF

  /**
   * Level 1 of the official Bloxorz game
   */
  object Level1 extends Level {
    val level =
      """ooo-------
        |oSoooo----
        |ooooooooo-
        |-ooooooooo
        |-----ooToo
        |------ooo-""".stripMargin
  }

  println(Level1.startPos)    // TODO: DELETE
  println(Level1.startBlock)    // TODO: DELETE
  println(Level1.startBlock.neighbors)    // TODO: DELETE
  println(Level1.startBlock.legalNeighbors)    // TODO: DELETE
  println(Level1.done(Level1.Block(Level1.Pos(1,1),Level1.Pos(1,1)))) // TODO: DELETE

  val x: Stream[(Level1.Block, List[Level1.Move])] = Level1.startBlock.legalNeighbors.toStream.map{case (x: Level1.Block, y: Level1.Move) => (x, y :: List())}
  println(x)
  println(Level1.done(Level1.Block(Level1.Pos(4,7),Level1.Pos(4,7)))) // TODO: DELETE

//  println(Level1.solution)  TODO: TAKE OFF
}
