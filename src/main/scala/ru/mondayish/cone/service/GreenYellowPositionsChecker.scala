package ru.mondayish.cone.service

import ru.mondayish.cone.model.Square

class GreenYellowPositionsChecker {

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

  def isGreenFillCorrectly(permutations: List[Square]): Boolean = {
    if (permutations.size == 1) {
      permutations.head.bottomRight <= 10
    } else if (permutations.size == 2) {
      permutations.head.bottomRight + permutations(1).bottomLeft <= 10
    } else if (permutations.size == 3) {
      permutations(2).bottomRight <= 10
    } else if (permutations.size == 4) {
      permutations.head.bottomRight + permutations(1).bottomLeft + permutations(3).topRight <= 10 &&
        permutations(2).bottomRight + permutations(3).bottomLeft <= 10 &&
        permutations(3).bottomRight <= 10
    } else if (permutations.size == 5) {
      permutations(3).bottomRight + permutations(4).bottomLeft <= 10 &&
        permutations(4).bottomRight <= 10
    } else if (permutations.size == 6) {
      permutations(4).bottomRight + permutations(5).bottomLeft <= 10
    } else if (permutations.size == 7) {
      permutations(2).bottomRight + permutations(3).bottomLeft + permutations(6).topRight <= 10
    } else if (permutations.size == 8) {
      permutations(3).bottomRight + permutations(4).bottomLeft + permutations(7).topRight <= 10 &&
        permutations(7).bottomRight <= 10
    } else if (permutations.size == 9) {
      permutations(4).bottomRight + permutations(5).bottomLeft + permutations(8).topRight <= 10 &&
        permutations(7).bottomRight + permutations(8).bottomLeft <= 10
    } else if (permutations.size == 11) {
      permutations(7).bottomRight + permutations(8).bottomLeft + permutations(10).topRight <= 10
    } else {
      true
    }
  }

  def isYellowFillCorrectly(permutations: List[Square]): Boolean = {
    if (permutations.size == 1) {
      permutations.head.bottomLeft <= 10 && permutations.head.topRight <= 10
    } else if (permutations.size == 2) {
      permutations(1).topRight <= 10
    } else if (permutations.size == 3) {
      permutations(2).bottomLeft <= 10 && permutations.head.bottomLeft + permutations(2).topRight <= 10
    } else if (permutations.size == 5) {
      permutations(1).bottomRight + permutations(4).topRight <= 10
    } else if (permutations.size == 6) {
      permutations(5).bottomRight <= 10
    } else if (permutations.size == 7) {
      permutations(6).bottomRight <= 10
    } else if (permutations.size == 8) {
      permutations(6).bottomRight + permutations(7).bottomLeft <= 10
    } else if (permutations.size == 9) {
      permutations(8).bottomRight <= 10
    } else if (permutations.size == 10) {
      permutations(8).bottomRight + permutations(9).bottomLeft <= 10
    } else if (permutations.size == 11) {
      permutations(10).bottomRight <= 10
    } else {
      true
    }
  }
}
