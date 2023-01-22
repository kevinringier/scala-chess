package board.standard

import board.PositionConstituent

sealed trait File extends PositionConstituent
case object A extends File
case object B extends File
case object C extends File
case object D extends File
case object E extends File
case object F extends File
case object G extends File
case object H extends File

object File:
  def toFile(i: Int): File =
    i match
      case 1 => A
      case 2 => B
      case 3 => C
      case 4 => D
      case 5 => E
      case 6 => F
      case 7 => G
      case 8 => H
      case _ => throw new IllegalArgumentException(s"Invalid file ${i}")

  def toInt(f: File): Int =
    f match
      case A => 1
      case B => 2
      case C => 3
      case D => 4
      case E => 5
      case F => 6
      case G => 7
      case H => 8