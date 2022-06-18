package ru.mondayish.cone.service

class ListToStringHelper {

  def makeListOfSquaresPretty[T](permutations: List[T]): String = {
    permutations.map(t => t.toString).mkString("\n")
  }
}
