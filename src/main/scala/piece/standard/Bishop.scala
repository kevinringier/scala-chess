package piece.standard

import piece.Team

case class Bishop(team: Team) extends StandardPiece:
  val name = "Bishop"


// TODO how do we get the bishop to implement all the styles of movement, i.e. UpLeft, UpRight, etc with slidable.