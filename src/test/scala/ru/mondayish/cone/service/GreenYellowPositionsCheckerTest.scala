package ru.mondayish.cone.service

import org.junit.Assert._
import org.junit.Test
import ru.mondayish.cone.model.Square

@Test
class GreenYellowPositionsCheckerTest {

  @Test
  def checkIsGreenPositionsOkTrueTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertTrue(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6)
    )))

    assertTrue(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2)
    )))

    assertTrue(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3)
    )))

    assertTrue(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 3, 8)
    )))

    assertTrue(positionsChecker.isGreenPositionsOk(List(
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
  }

  @Test
  def checkIsGreenPositionsOkFalseTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertFalse(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 2, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6)
    )))

    assertFalse(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(4, 0, 5, 2)
    )))

    assertFalse(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 2, 5, 2),
      new Square(3, 0, 4, 3)
    )))

    assertFalse(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 1, 4, 3),
      new Square(1, 7, 3, 8)
    )))

    assertFalse(positionsChecker.isGreenPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 1),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 3, 8),
      new Square(5, 1, 0, 7),
      new Square(3, 4, 3, 0)
    )))
  }

  @Test
  def checkIsYellowPositionsOkTrueTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertTrue(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 3, 8)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
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
      new Square(5, 1, 0, 7)
    )))

    assertTrue(positionsChecker.isYellowPositionsOk(List(
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
  }

  @Test
  def checkIsYellowPositionsOkFalseTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertFalse(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(4, 7, 1, 2)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 1, 5, 1),
      new Square(3, 2, 0, 4)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 6, 3, 6),
      new Square(4, 0, 3, 3)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(6, 4, 6, 0)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 8, 3, 8)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
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
      new Square(8, 1, 0, 7)
    )))

    assertFalse(positionsChecker.isYellowPositionsOk(List(
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
      new Square(3, 5, 3, 0)
    )))
  }

  @Test
  def checkIsGreenFillCorrectlyTrueTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3)
    )))

    assertTrue(positionsChecker.isGreenFillCorrectly(List(
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
      new Square(5, 1, 0, 7)
    )))
  }

  @Test
  def checkIsGreenFillCorrectlyFalseTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 11)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 9, 2)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 12)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 7, 0, 4)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 8, 6)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 5, 3)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 10, 6, 0)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 11)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 9, 3)
    )))

    assertFalse(positionsChecker.isGreenFillCorrectly(List(
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
      new Square(5, 5, 0, 7)
    )))
  }

  @Test
  def checkIsYellowFillCorrectlyTrueTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 3, 8)
    )))

    assertTrue(positionsChecker.isYellowFillCorrectly(List(
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
      new Square(5, 1, 0, 7)
    )))
  }

  @Test
  def checkIsYellowFillCorrectlyFalseTests(): Unit = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 11, 7, 3)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 11)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 4, 5, 1)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 9, 3, 6)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 11)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 12)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 11, 2)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 11)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
      new Square(0, 7, 7, 3),
      new Square(3, 7, 1, 2),
      new Square(8, 0, 5, 1),
      new Square(3, 2, 0, 4),
      new Square(4, 4, 3, 6),
      new Square(4, 0, 3, 3),
      new Square(5, 4, 6, 0),
      new Square(5, 0, 5, 2),
      new Square(3, 0, 4, 3),
      new Square(1, 7, 8, 8)
    )))

    assertFalse(positionsChecker.isYellowFillCorrectly(List(
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
      new Square(5, 1, 0, 12)
    )))
  }
}