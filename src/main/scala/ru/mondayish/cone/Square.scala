package ru.mondayish.cone

class Square(private val _topLeft: Int,
             private val _topRight: Int,
             private val _bottomLeft: Int,
             private val _bottomRight: Int) {

  def topLeft: Int = _topLeft
  def topRight: Int = _topRight
  def bottomLeft: Int = _bottomLeft
  def bottomRight: Int = _bottomRight

  override def toString: String = _topLeft + " " + _topRight + " " + _bottomLeft + " " + _bottomRight
}
















