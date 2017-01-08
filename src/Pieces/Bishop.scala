package Pieces

import Helpers.Color.Color
import Helpers.Type.Type
import Game._
import Helpers.Type


class Bishop(color: Color) extends Piece(color: Color) {

  override val pieceValue: Integer = 330

  def pieceType: Type = Type.Bishop


  def blockedByPiece(state: Array[Array[Spot]], from: (Integer,Integer), to: (Integer,Integer)): Boolean = {
    isBlockedDiagonal(state,from,to)
  }


  override
  def isValidMoveSet(state: Array[Array[Spot]], from: (Integer,Integer), to: (Integer,Integer)): Boolean = {

    if (!super.isValidMoveSet(state, from, to)) { return false }

    if(Math.abs(to._1-from._1) != Math.abs(to._2-from._2)){ return false }

    true
  }

}
