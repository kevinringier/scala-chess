package board.dimension.two.standard

import board.{Position2, Position2ToTwoDimensionCoordinate, TwoDimensionCoordinate, TwoDimensionCoordinateToPosition2}

case class StandardPosition[R <: Rank, F <: File](rank: R, file: F) extends Position2[R, F]

//object Position:
 // def fromArrayIndex(index: Int): Position = ???


given standardPositionToTwoDimensionPosition: Position2ToTwoDimensionCoordinate[StandardPosition[Rank, File]] with
  extension (p: StandardPosition[Rank, File])
    def toTwoDimensionPosition: TwoDimensionCoordinate =
       TwoDimensionCoordinate(Rank.toInt(p.rank), File.toInt(p.file))

given twoDimensionCoordinateToStandardPosition: TwoDimensionCoordinateToPosition2[StandardPosition[Rank, File]] with
  extension (c: TwoDimensionCoordinate)
    def toPosition2: StandardPosition[Rank, File] =
      StandardPosition(Rank.toRank(c.x), File.toFile(c.y))
