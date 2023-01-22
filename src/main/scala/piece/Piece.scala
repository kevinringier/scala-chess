package piece

trait Piece:
  val team: Team
  val name: String

trait Team

// Move all movement related logic to it's own package.
// In either case we generate movement for pieces, we will have to define instances for each type of position we care about
// e.g. type of movement on a standard board using StandardPosition[Rank, File] vs. the generic movement definition
// for Position2[PositionConstituent, PositionConstituent]
//trait Moveable[A]:
 // def moves(pos: Position): List[Position]
  //extension (a: A) def extMoves(pos: Position): List[Position] = moves(pos)


// Do we want to think about moves as a set of generators for each individual piece that they can implement?
// for example, horizontalSlide, verticalSlide, L-Jump (think Knights), singleHopMovements in each direction,
// where a king would implement all directions and a pawn would implement only one for general movement and
// diagonal for attacking. then each piece would compose it's set of moves for each implemented trait?

// how can we do that.

// this would make movement easily extendable by any piece rather than need to implement a unique movement for
// each piece.

trait ShowPiece[P <: Piece]:
  extension (p: P) def show: String = s"${p.team} ${p.name}"