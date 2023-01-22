package board

trait Position
// One-dimensional Position
trait Position1[T1 <: PositionConstituent] extends Position

// Two-dimensional Position
trait Position2[T1 <: PositionConstituent, T2 <: PositionConstituent] extends Position

// Three-dimensional Position
trait Position3[T1 <: PositionConstituent, T2 <: PositionConstituent, T3 <: PositionConstituent] extends Position


// All boards will be stored within a single 0-based index collection. This typeclass
// provides a general contract that positions will need to implement an instance
// of this typeclass in order to convert the type of position to it's respective
// array position.
trait Position2ToArrayIndex[P <: Position2[_, _]]:
  extension (p: P)
    def toArrayIndex: Int



