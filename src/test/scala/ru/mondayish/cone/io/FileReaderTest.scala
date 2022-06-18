package ru.mondayish.cone.io

import org.junit.Assert._
import org.junit._
import ru.mondayish.cone.model.Square

@Test
class FileReaderTest {

  private val FILE1: String = "squares1.txt"
  private val FILE2: String = "squares2.txt"
  private val FILE3: String = "squares3.txt"

  @Test
  def readSquaresFromFileTest1(): Unit = {
    assertEquals(new FileReader().readSquaresFromFile(FILE1),
      List(
        new Square(8, 0, 5, 1),
        new Square(4, 4, 3, 6),
        new Square(3, 7, 1, 2),
        new Square(5, 0, 5, 2),
        new Square(3, 0, 4, 3),
        new Square(5, 1, 0, 7),
        new Square(4, 0, 3, 3),
        new Square(5, 4, 6, 0),
        new Square(3, 4, 3, 0),
        new Square(1, 7, 3, 8),
        new Square(0, 7, 7, 3),
        new Square(3, 2, 0, 4)
      ))
  }

  @Test
  def readSquaresFromFileTest2(): Unit = {
    assertEquals(new FileReader().readSquaresFromFile(FILE2),
      List(
        new Square(1, 6, 4, 0),
        new Square(6, 1, 3, 5),
        new Square(4, 0, 5, 2),
        new Square(4, 1, 3, 5),
        new Square(5, 1, 4, 2),
        new Square(6, 5, 5, 4),
        new Square(4, 0, 4, 6),
        new Square(5, 2, 1, 4),
        new Square(4, 6, 0, 1),
        new Square(2, 0, 1, 4),
        new Square(3, 0, 4, 5),
        new Square(4, 0, 5, 1)
      ))
  }

  @Test
  def readSquaresFromFileTest3(): Unit = {
    assertEquals(new FileReader().readSquaresFromFile(FILE3),
      List(
        new Square(3, 3, 3, 4),
        new Square(4, 1, 3, 5),
        new Square(4, 5, 3, 4),
        new Square(5, 2, 1, 3),
        new Square(3, 3, 7, 4),
        new Square(2, 1, 3, 3),
        new Square(3, 2, 6, 1),
        new Square(4, 3, 3, 4),
        new Square(5, 2, 2, 2),
        new Square(4, 2, 2, 3),
        new Square(5, 5, 1, 4),
        new Square(1, 2, 5, 3)
      ))
  }
}
