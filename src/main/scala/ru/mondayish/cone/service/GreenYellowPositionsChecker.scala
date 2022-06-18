package ru.mondayish.cone.service

import ru.mondayish.cone.model.Square

/**
 * Checks that green/yellow zones are correct
 */
class GreenYellowPositionsChecker {

  /**
   * Checks if all filled green zones are ok
   * @param permutation list to check
   * @return true if all zones are ok
   */
  def isGreenPositionsOk(permutation: List[Square]): Boolean = {
    if (permutation.size == 5) {
      permutation.head.bottomRight + permutation(1).bottomLeft +
        permutation(3).topRight + permutation(4).topLeft == 10
    } else if (permutation.size == 8) {
      permutation(2).bottomRight + permutation(3).bottomLeft +
        permutation(6).topRight + permutation(7).topLeft == 10
    } else if (permutation.size == 9) {
      permutation(3).bottomRight + permutation(4).bottomLeft +
        permutation(7).topRight + permutation(8).topLeft == 10
    } else if (permutation.size == 10) {
      permutation(4).bottomRight + permutation(5).bottomLeft +
        permutation(8).topRight + permutation(9).topLeft == 10
    } else if (permutation.size == 12) {
      permutation(7).bottomRight + permutation(8).bottomLeft +
        permutation(10).topRight + permutation(11).topLeft == 10
    } else {
      true
    }
  }

  /**
   * Checks if all filled yellow zones are ok
   * @param permutation list to check
   * @return true if all zones are ok
   */
  def isYellowPositionsOk(permutation: List[Square]): Boolean = {
    if (permutation.size == 2) {
      permutation.head.topRight + permutation(1).topLeft <= 10
    } else if (permutation.size == 4) {
      permutation.head.bottomLeft + permutation(2).topRight + permutation(3).topLeft <= 10
    } else if (permutation.size == 6) {
      permutation(1).bottomRight + permutation(4).topRight + permutation(5).topLeft <= 10
    } else if (permutation.size == 7) {
      permutation(2).bottomLeft + permutation(6).topLeft <= 10
    } else if (permutation.size == 10) {
      permutation(5).bottomRight + permutation(9).topRight <= 10
    } else if (permutation.size == 11) {
      permutation(6).bottomRight + permutation(7).bottomLeft + permutation(10).topLeft <= 10
    } else if (permutation.size == 12) {
      permutation(10).bottomRight + permutation(11).bottomLeft <= 10 &&
        permutation(8).bottomRight + permutation(9).bottomLeft + permutation(11).topRight <= 10
    } else {
      true
    }
  }

  /**
   * Checks if not completely filled green zones are ok
   * @param permutation list to check
   * @return true if zones are ok
   */
  def isGreenFillCorrectly(permutation: List[Square]): Boolean = {
    if (permutation.size == 1) {
      permutation.head.bottomRight <= 10
    } else if (permutation.size == 2) {
      permutation.head.bottomRight + permutation(1).bottomLeft <= 10
    } else if (permutation.size == 3) {
      permutation(2).bottomRight <= 10
    } else if (permutation.size == 4) {
      permutation.head.bottomRight + permutation(1).bottomLeft + permutation(3).topRight <= 10 &&
        permutation(2).bottomRight + permutation(3).bottomLeft <= 10 &&
        permutation(3).bottomRight <= 10
    } else if (permutation.size == 5) {
      permutation(3).bottomRight + permutation(4).bottomLeft <= 10 &&
        permutation(4).bottomRight <= 10
    } else if (permutation.size == 6) {
      permutation(4).bottomRight + permutation(5).bottomLeft <= 10
    } else if (permutation.size == 7) {
      permutation(2).bottomRight + permutation(3).bottomLeft + permutation(6).topRight <= 10
    } else if (permutation.size == 8) {
      permutation(3).bottomRight + permutation(4).bottomLeft + permutation(7).topRight <= 10 &&
        permutation(7).bottomRight <= 10
    } else if (permutation.size == 9) {
      permutation(4).bottomRight + permutation(5).bottomLeft + permutation(8).topRight <= 10 &&
        permutation(7).bottomRight + permutation(8).bottomLeft <= 10
    } else if (permutation.size == 11) {
      permutation(7).bottomRight + permutation(8).bottomLeft + permutation(10).topRight <= 10
    } else {
      true
    }
  }

  /**
   * Checks if not completely filled yellow zones are ok
   * @param permutation list to check
   * @return true if zones are ok
   */
  def isYellowFillCorrectly(permutation: List[Square]): Boolean = {
    if (permutation.size == 1) {
      permutation.head.bottomLeft <= 10 && permutation.head.topRight <= 10
    } else if (permutation.size == 2) {
      permutation(1).bottomRight <= 10
    } else if (permutation.size == 3) {
      permutation(2).bottomLeft <= 10 && permutation.head.bottomLeft + permutation(2).topRight <= 10
    } else if (permutation.size == 5) {
      permutation(1).bottomRight + permutation(4).topRight <= 10
    } else if (permutation.size == 6) {
      permutation(5).bottomRight <= 10
    } else if (permutation.size == 7) {
      permutation(6).bottomRight <= 10
    } else if (permutation.size == 8) {
      permutation(6).bottomRight + permutation(7).bottomLeft <= 10
    } else if (permutation.size == 9) {
      permutation(8).bottomRight <= 10
    } else if (permutation.size == 10) {
      permutation(8).bottomRight + permutation(9).bottomLeft <= 10
    } else if (permutation.size == 11) {
      permutation(10).bottomRight <= 10
    } else {
      true
    }
  }
}
