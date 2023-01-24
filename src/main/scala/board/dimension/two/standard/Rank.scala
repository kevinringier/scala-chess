package board.dimension.two.standard

import board.dimension.two.RowPositionConstituent

sealed trait Rank extends RowPositionConstituent
case object One extends Rank
case object Two extends Rank
case object Three extends Rank
case object Four extends Rank
case object Five extends Rank
case object Six extends Rank
case object Seven extends Rank
case object Eight extends Rank

object Rank:
  def toRank(i: Int): Rank =
    i match
      case 1 => One
      case 2 => Two
      case 3 => Three
      case 4 => Four
      case 5 => Five
      case 6 => Six
      case 7 => Seven
      case 8 => Eight
      case _ => throw new IllegalArgumentException(s"Invalid rank ${i}")

  def toInt(r: Rank): Int =
    r match
      case One => 1
      case Two => 2
      case Three => 3
      case Four => 4
      case Five => 5
      case Six => 6
      case Seven => 7
      case Eight => 8
