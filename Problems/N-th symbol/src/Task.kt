import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val str = scanner.nextLine()
    val ind = scanner.next().toInt()
    println("Symbol # $ind of the string \"$str\" is '${str[ind - 1]}'")
}