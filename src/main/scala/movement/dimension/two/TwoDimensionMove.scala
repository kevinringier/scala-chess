package movement.dimension.two

import board.{Position2, Position2ToTwoDimensionCoordinate, TwoDimensionCoordinateToPosition2}
import board.dimension.two.{ColumnPositionConstituent, RowPositionConstituent, TwoDimensionalBoard}
import movement.TwoDimensionDirection
import piece.Piece

import scala.::

case class TwoDimensionMove[
  D <: TwoDimensionDirection,
  R <: RowPositionConstituent,
  C <: ColumnPositionConstituent,
  Pos <: Position2[R, C] : Position2ToTwoDimensionCoordinate : TwoDimensionCoordinateToPosition2
]():
  def apply(p: Pos, direction: D): Option[Pos] =
    val coord = p.toTwoDimensionPosition
    val move = direction(coord)

    // TODO: hard coded bound checks for standard board. This should use a board ask if the position is in bounds.
    if (move.x < 1 || move.x > 8 || move.y < 1 || move.y > 8) {
      return None
    }

    Some(move.toPosition2)

trait TwoDimensionHop // Knight

trait Slides

trait Slidable[P <: Slides]:
  def slide[
    D <: TwoDimensionDirection,
    R <: RowPositionConstituent,
    C <: ColumnPositionConstituent,
    Pos <: Position2[R, C] : Position2ToTwoDimensionCoordinate : TwoDimensionCoordinateToPosition2,
    M <: TwoDimensionMove[D, R, C, Pos]
  ](move: M, p: Pos, direction: D): List[Pos]

  extension (piece: P)
    def extSlides[
      D <: TwoDimensionDirection,
      R <: RowPositionConstituent,
      C <: ColumnPositionConstituent,
      Pos <: Position2[R, C] : Position2ToTwoDimensionCoordinate : TwoDimensionCoordinateToPosition2,
      M <: TwoDimensionMove[D, R, C, Pos]
    ](move: M, p: Pos, direction: D): List[Pos] = slide(move, p, direction)

given slidablePiece: Slidable[Slides] with
  def slide[
    D <: TwoDimensionDirection,
    R <: RowPositionConstituent,
    C <: ColumnPositionConstituent,
    Pos <: Position2[R, C] : Position2ToTwoDimensionCoordinate : TwoDimensionCoordinateToPosition2,
    M <: TwoDimensionMove[D, R, C, Pos]
  ](move: M, p: Pos, direction: D): List[Pos] =
    move(p, direction) match
      case Some(newPosition) => newPosition :: slide(move, newPosition, direction)
      case None => Nil