import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.next().toInt()
    if (n in -14..12 || n in 15..16 || n >= 19) {
        println("True")
    } else {
        println("False")
    }
}