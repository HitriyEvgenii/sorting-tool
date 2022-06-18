package sorting
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbersList = emptyList<Int>().toMutableList()
    while (scanner.hasNext()) {
        val line = scanner.nextLine().split("\\s+".toRegex())
        //println(line)
        numbersList += line.map {it.toString().toInt()}
        //println(numbersList)
    }
    val maxValue = numbersList.maxOrNull()
    val maxCount = numbersList.count {max -> max == maxValue}
    println("Total numbers: ${numbersList.size}")
    println("The greatest number: ${maxValue} (${maxCount} time(s)).")
}
