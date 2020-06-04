import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var twos = 0
    var threes = 0
    var fours = 0
    var fives = 0

    val n = scanner.next().toInt()
    repeat(n) {
        when (scanner.next().toInt()) {
            2 -> twos++
            3 -> threes++
            4 -> fours++
            5 -> fives++
            else -> println("error!")
        }
    }
    println("$twos $threes $fours $fives")

}