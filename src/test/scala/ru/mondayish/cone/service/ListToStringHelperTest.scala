package ru.mondayish.cone.service

import org.junit.Assert._
import org.junit.Test
import ru.mondayish.cone.model.Square

@Test
class ListToStringHelperTest {

  private val RESULT1 = "0 7 7 3\n3 7 1 2\n8 0 5 1\n3 2 0 4\n4 4 3 6\n4 0 3 3\n5 4 6 0\n5 0 5 2\n3 0 4 3\n1 7 3 8\n5 1 0 7\n3 4 3 0"
  private val RESULT2 = "3 0 4 5\n4 6 0 1\n4 0 5 1\n4 0 4 6\n5 2 1 4\n6 5 5 4\n4 0 5 2\n5 1 4 2\n2 0 1 4\n1 6 4 0\n4 1 3 5\n6 1 3 5"
  private val RESULT3 = "5 2 2 2\n5 5 1 4\n3 2 6 1\n4 3 3 4\n4 2 2 3\n4 5 3 4\n4 1 3 5\n5 2 1 3\n2 1 3 3\n3 3 3 4\n3 3 7 4\n1 2 5 3"

  @Test
  def makeListOfSquaresPrettyTests(): Unit = {
    val listToStringHelper: ListToStringHelper = new ListToStringHelper()

    assertEquals(RESULT1, listToStringHelper.makeListOfSquaresPretty(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 3, 8),
      new Square(5, 1, 0, 7),
      new Square(3, 4, 3, 0)
    )))

    assertEquals(RESULT2, listToStringHelper.makeListOfSquaresPretty(List(
      new Square(3, 0, 4, 5),
      new Square(4, 6, 0, 1),
      new Square(4, 0, 5, 1),
      new Square(4, 0, 4, 6),
      new Square(5, 2, 1, 4),
      new Square(6, 5, 5, 4),
      new Square(4, 0, 5, 2),
      new Square(5, 1, 4, 2),
      new Square(2, 0, 1, 4),
      new Square(1, 6, 4, 0),
      new Square(4, 1, 3, 5),
      new Square(6, 1, 3, 5)
    )))

    assertEquals(RESULT3, listToStringHelper.makeListOfSquaresPretty(List(
      new Square(5, 2, 2, 2),
      new Square(5, 5, 1, 4),
      new Square(3, 2, 6, 1),
      new Square(4, 3, 3, 4),
      new Square(4, 2, 2, 3),
      new Square(4, 5, 3, 4),
      new Square(4, 1, 3, 5),
      new Square(5, 2, 1, 3),
      new Square(2, 1, 3, 3),
      new Square(3, 3, 3, 4),
      new Square(3, 3, 7, 4),
      new Square(1, 2, 5, 3)
    )))
  }
}
