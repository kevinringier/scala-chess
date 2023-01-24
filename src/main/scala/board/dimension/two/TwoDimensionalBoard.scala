package board.dimension.two

import board.{Board, Position2}
import piece.Piece

import scala.collection.immutable.HashMap

trait TwoDimensionalBoard[R <: RowPositionConstituent, C <: ColumnPositionConstituent, Pos <: Position2[R, C], P <: Piece]
  extends Board[Pos, P]