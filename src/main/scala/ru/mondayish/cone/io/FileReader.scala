package ru.mondayish.cone.io

import ru.mondayish.cone.model.Square
import scala.io.{BufferedSource, Source}

class FileReader {

  def readSquaresFromFile(fileName: String): List[Square] = {
    val source: BufferedSource = Source.fromFile(fileName)
    source.mkString.split("\n")
      .map(line => {
        val nums: Array[String] = line.split(" ")
        new Square(nums(0).toInt, nums(1).toInt, nums(2).toInt, nums(3).replaceAll("\r", "").toInt)
      }).toList
  }
}
