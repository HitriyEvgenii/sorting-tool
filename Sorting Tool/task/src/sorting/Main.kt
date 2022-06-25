package sorting
import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    args ?: "word"
    when {
        args[0] == "-sortIntegers" -> sortIntegers()
        args[1] == "word" -> typeWord()
        args[1] == "long" -> typeInt()
        args[1] == "line" -> typeLine()
    }

    //typeLine()
}

fun typeInt() {
    val scanner = Scanner(System.`in`)
    val numbersList = emptyList<Int>().toMutableList()
    while (scanner.hasNext()) {
        val line = scanner.nextLine().split("\\s+".toRegex())
        numbersList += line.map {it.toString().toInt()}
    }
    val maxValue = numbersList.maxOrNull()
    val maxCount = numbersList.count {max -> max == maxValue}
    println("Total numbers: ${numbersList.size}.")
    println("The greatest number: ${maxValue} (${maxCount} time(s)), ${((maxCount.toDouble() * 100) / numbersList.size).toInt()}%).")
}

fun typeWord() {
    val scanner = Scanner(System.`in`)
    val numbersList = emptyList<String>().toMutableList()
    while (scanner.hasNext()) {
        val line = scanner.nextLine().split("\\s+".toRegex())
        numbersList += line
    }
    val maxValue = numbersList.maxWithOrNull (compareBy {it.length})
    val maxCount = numbersList.count {max -> max == maxValue}
    println("Total words: ${numbersList.size}.")
    println("The longest word: ${maxValue} (${maxCount} time(s), ${((maxCount.toDouble() * 100) / numbersList.size).toInt()}%).")
}

fun typeLine() {
    val scanner = Scanner(System.`in`)
    val numbersList = emptyList<String>().toMutableList()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        numbersList.add(line)
    }
    val maxValue = numbersList.maxWithOrNull (compareBy {it.length})
    val maxCount = numbersList.count {max -> max == maxValue}
    println("Total lines: ${numbersList.size}.")
    println("The longest line:")
    println(maxValue)
    println("(${maxCount} time(s), ${((maxCount.toDouble() * 100) / numbersList.size).toInt()}%).")
}

fun sortIntegers() {}