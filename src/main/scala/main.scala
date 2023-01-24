import board.dimension.two.standard.*
import board.dimension.two.standard.{standardPositionToTwoDimensionPosition, twoDimensionCoordinateToStandardPosition}
import movement.{TwoDimensionDirection, Up}
import movement.dimension.two.TwoDimensionMove
import movement.dimension.two.slidablePiece
import piece.standard.{Rook, White}

@main def run() =
  println("This is the chess engine!")
  val position: StandardPosition[Rank, File] = StandardPosition(One, A);
  println(position)

  val move = TwoDimensionMove[TwoDimensionDirection, Rank, File, StandardPosition[Rank, File]]()

  val newPosition = move(position, new Up{})

  val newPositions = slidablePiece.slide(move, newPosition.get, new Up{})

  println(newPosition)

  newPositions.foreach(println)

  val rook = Rook(White)

  // movement should be implied on the slide. not a concrete argument
  // position should be provided
  // this still needs work but I think we are approaching the spirit.
  val rookMoves = rook.extSlides(move, position, new Up{})  // this api is trash, can the direction be pulled off the type somehow?

  rookMoves.foreach(println)







