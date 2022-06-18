package ru.mondayish.cone.model

class Square(private val _topLeft: Int,
             private val _topRight: Int,
             private val _bottomLeft: Int,
             private val _bottomRight: Int) {

  def topLeft: Int = _topLeft

  def topRight: Int = _topRight

  def bottomLeft: Int = _bottomLeft

  def bottomRight: Int = _bottomRight

  override def toString: String = _topLeft + " " + _topRight + " " + _bottomLeft + " " + _bottomRight

  def canEqual(other: Any): Boolean = other.isInstanceOf[Square]

  override def equals(other: Any): Boolean = other match {
    case that: Square =>
      (that canEqual this) &&
        _topLeft == that._topLeft &&
        _topRight == that._topRight &&
        _bottomLeft == that._bottomLeft &&
        _bottomRight == that._bottomRight
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(_topLeft, _topRight, _bottomLeft, _bottomRight)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
















