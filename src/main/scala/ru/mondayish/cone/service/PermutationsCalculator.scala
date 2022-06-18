package ru.mondayish.cone.service

import ru.mondayish.cone.model.Square

import scala.collection.mutable.ListBuffer

class PermutationsCalculator {

  def findAllPermutations(start: List[Square], nums: List[Square]): ListBuffer[List[Square]] = {
    val size = nums.size
    var result = ListBuffer[List[Square]]()

    if (size == 0 && checkPermutation(start)) {
      result += start
    }
    else {
      for (i <- 0 until size) {
        val permutations: List[Square] = start :+ nums(i)
        val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()

        if (positionsChecker.isGreenPositionsOk(permutations) && positionsChecker.isYellowPositionsOk(permutations) &&
          positionsChecker.isGreenFillCorrectly(permutations) && positionsChecker.isYellowFillCorrectly(permutations)) {
          result = concatenateTwoListBuffers(result,
            findAllPermutations(permutations, nums.slice(0, i) ::: nums.slice(i + 1, size)))
        }
      }
    }
    result
  }

  private def checkPermutation(permutation: List[Square]): Boolean = {
    val positionsChecker: GreenYellowPositionsChecker = new GreenYellowPositionsChecker()
    positionsChecker.isGreenPositionsOk(permutation) && positionsChecker.isYellowPositionsOk(permutation)
  }

  private def concatenateTwoListBuffers(l1: ListBuffer[List[Square]], l2: ListBuffer[List[Square]]): ListBuffer[List[Square]] = {
    val result: ListBuffer[List[Square]] = ListBuffer()
    l1.foreach(x => result += x)
    l2.foreach(x => result += x)
    result
  }
}
