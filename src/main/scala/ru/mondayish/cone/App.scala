package ru.mondayish.cone

import ru.mondayish.cone.io.FileReader
import ru.mondayish.cone.model.Square
import ru.mondayish.cone.service.{ListToStringHelper, PermutationsCalculator}

import scala.collection.mutable.ListBuffer

object App {

  def main(args: Array[String]): Unit = {
    val squares: List[Square] = new FileReader().readSquaresFromFile("squares0.txt")
    val result: ListBuffer[List[Square]] = new PermutationsCalculator()
      .findAllPermutations(List[Square](), squares)
    println(result.map(x => new ListToStringHelper().makeListOfSquaresPretty(x)).mkString("\n\n"))
  }
}
