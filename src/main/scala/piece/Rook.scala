package piece


case class Rook() extends Piece:
  val name: String = "Rook"

given rookMoves: Moveable[Rook] with
  def moves(pos: Position): List[Position] =
    // does this need to be mutable, is that the bug?
    // if so, we have 2 options, make it mutable, or refactor using immutable lists
    val moves: scala.collection.mutable.List[Position] = List()

    for i <- 1 to 8 if i != pos.file
      do //Position(pos.rank, i) :: moves
        val newPos = Position(pos.rank, i)
        newPos :: moves

    for i <- 1 until 8
      do if (i != pos.rank) then Position(i, pos.file) :: moves

    //moves
    List(Position(1,2))
