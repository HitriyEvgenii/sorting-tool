package sorting
import java.util.Scanner

fun main(args: Array<String>) {
    /*args ?: "word"
    when {
        args[2] == "word" -> typeWord()
        args[0] == "long" -> typeInt()
        args[1] == "line" -> typeLine()
    }
    */
    typeWord()
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
    println("The greatest number: ${maxValue} (${maxCount} time(s)).")
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

fun typeLine() {}