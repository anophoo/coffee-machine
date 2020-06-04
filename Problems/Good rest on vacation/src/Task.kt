import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    val c = scanner.nextLong()
    val d = scanner.nextLong()
    println(a * b + 2 * c + d * (a - 1))
}