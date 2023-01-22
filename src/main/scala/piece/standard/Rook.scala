package piece


case class Rook(team: Team) extends Piece

//given rookMoves: Moveable[Rook] with
  //def moves(pos: Position): List[Position] =
    //val filePositions = for i <- 1 to 8 if i != pos.file
    //yield Position(pos.rank, i)

    //val rankPositions = for i <- 1 to 8 if i != pos.rank
    //yield Position(i, pos.file)

    //(rankPositions ++ filePositions).toList
