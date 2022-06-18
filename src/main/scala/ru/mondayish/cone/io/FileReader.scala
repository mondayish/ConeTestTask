package ru.mondayish.cone.io

import ru.mondayish.cone.model.Square
import scala.io.{BufferedSource, Source}

/**
 * Helps read squares from file
 */
class FileReader {

  /**
   * Read file and parse it to List[Square]
   * @param fileName name of file to parse
   * @return list of parsed squares
   */
  def readSquaresFromFile(fileName: String): List[Square] = {
    val source: BufferedSource = Source.fromFile(fileName)
    source.mkString.split("\n")
      .map(line => {
        val nums: Array[String] = line.split(" ")
        new Square(nums(0).toInt, nums(1).toInt, nums(2).toInt, nums(3).replaceAll("\r", "").toInt)
      }).toList
  }
}
