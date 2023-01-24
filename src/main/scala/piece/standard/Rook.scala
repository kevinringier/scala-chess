package piece.standard

import piece.{Piece, Team}
import movement.dimension.two.Slides
import movement.Up

case class Rook(team: Team) extends StandardPiece with Slides:
  val name = "Rook"

//given rookMoves: Moveable[Rook] with
  //def moves(pos: Position): List[Position] =
    //val filePositions = for i <- 1 to 8 if i != pos.file
    //yield Position(pos.rank, i)

    //val rankPositions = for i <- 1 to 8 if i != pos.rank
    //yield Position(i, pos.file)

    //(rankPositions ++ filePositions).toList
