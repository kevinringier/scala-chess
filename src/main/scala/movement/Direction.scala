package movement

import board.{Position2, Position2ToTwoDimensionCoordinate, TwoDimensionCoordinate}
import board.dimension.two.{ColumnPositionConstituent, RowPositionConstituent}

trait TwoDimensionDirection:
  def apply(coordinate: TwoDimensionCoordinate): TwoDimensionCoordinate

trait Up extends TwoDimensionDirection:
  def apply(coordinate: TwoDimensionCoordinate): TwoDimensionCoordinate =
    coordinate.copy(x = coordinate.x + 1)

//TODO(Martin): implement the missing apply definition for each direction
trait Down extends TwoDimensionDirection
trait Left extends TwoDimensionDirection
trait Right extends TwoDimensionDirection

trait UpLeft extends TwoDimensionDirection
trait UpRight extends TwoDimensionDirection
trait DownLeft extends TwoDimensionDirection
trait DownRight extends TwoDimensionDirection


