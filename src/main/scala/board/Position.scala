package board

trait Position

// One-dimensional Position
trait Position1[T1 <: PositionConstituent] extends Position

// Two-dimensional Position
trait Position2[T1 <: PositionConstituent, T2 <: PositionConstituent] extends Position

// When computing movement and positions, we will translate between (x: Int, y: Int) coordinates.
// This imposes all Position2's will follow coordinate system that can be translated into a 2-D space.
// For now I think that's fine.
case class TwoDimensionCoordinate(x: Int, y: Int)

// Typeclass that defines a Position2 converts to 2-Dimension Coordinate
trait Position2ToTwoDimensionCoordinate[P <: Position2[_, _]]:
  extension (p: P)
    def toTwoDimensionPosition: TwoDimensionCoordinate

trait TwoDimensionCoordinateToPosition2[P <: Position2[_, _]]:
  extension (c: TwoDimensionCoordinate)
    def toPosition2: P


// Three-dimensional Position
trait Position3[T1 <: PositionConstituent, T2 <: PositionConstituent, T3 <: PositionConstituent] extends Position
