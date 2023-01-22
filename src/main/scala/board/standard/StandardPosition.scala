package board.standard

import board.{Position2, Position2ToArrayIndex}
import board.standard.{File, Rank, StandardPosition}

case class StandardPosition[R <: Rank, F <: File](rank: R, file: F) extends Position2[R, F]

//object Position:
 // def fromArrayIndex(index: Int): Position = ???


given standardPositionToArrayIndex: Position2ToArrayIndex[StandardPosition[Rank, File]] with
  extension (p: StandardPosition[Rank, File])
    def toArrayIndex = ((Rank.toInt(p.rank) - 1) * 8) + (File.toInt(p.file) - 1)
