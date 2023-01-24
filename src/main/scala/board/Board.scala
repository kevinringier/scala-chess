package board

import piece.Piece

import scala.collection.immutable.HashMap

trait Board[Pos <: Position, P <: Piece]:
  val activePieces: HashMap[Pos, P]
  //def validatePosition(pos: Pos, p: P): true

  //def inBounds(pos: Pos): true

