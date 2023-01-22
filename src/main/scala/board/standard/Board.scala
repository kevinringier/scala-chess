package board.standard

import piece.Piece

case class Board(board: List[Option[Piece]]):
  def showBoard(): Unit =
    for pieceOpt <- board
    do pieceOpt match
      case Some(piece) => println(piece.name)
      case None => println("Empty")
      
      

