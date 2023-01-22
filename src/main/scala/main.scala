import piece.Position
import piece.rookMoves
import piece.standard.Rook

@main def run() =
  println("This is the chess engine!")
  val test = Position(1,1)
  println(test.convertToArrayIndex)

  val test2 = Position(8,8)
  println(test2.convertToArrayIndex)

  val rook = Rook()



  val legalMoves = rookMoves.moves(Position(0,0))

  legalMoves.foreach(println)

  val legalMoves2 = rook.extMoves(Position(0,0))




