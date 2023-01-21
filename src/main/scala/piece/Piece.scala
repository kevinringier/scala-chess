package piece

trait Piece:
  val name: String

trait Moveable[A]:
  def moves(pos: Position): List[Position]
  extension (a: A) def extMoves(pos: Position): List[Position] = moves(pos)


case class Position(rank: Int, file: Int):
  def convertToArrayIndex: Int =
    ((rank - 1) * 8) + (file - 1)

object Position:
  def fromArrayIndex(index: Int): Position = ???