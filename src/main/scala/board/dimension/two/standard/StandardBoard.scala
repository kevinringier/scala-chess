package board.dimension.two.standard

import board.dimension.two.TwoDimensionalBoard
import piece.Piece
import piece.standard.StandardPiece

import scala.collection.immutable.HashMap

case class StandardBoard[R <: Rank, F <: File, Pos <: StandardPosition[R, F], P <: StandardPiece](activePieces: HashMap[Pos, P])
  extends TwoDimensionalBoard[R, F, Pos, P]