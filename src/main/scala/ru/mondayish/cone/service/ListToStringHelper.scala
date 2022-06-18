package ru.mondayish.cone.service

/**
 * Helps parse List to String
 */
class ListToStringHelper {

  /**
   * Parse List[T] to pretty String
   * @param permutations list to parse
   * @tparam T elements of List
   * @return parsed String
   */
  def makeListOfSquaresPretty[T](permutations: List[T]): String = {
    permutations.map(t => t.toString).mkString("\n")
  }
}
