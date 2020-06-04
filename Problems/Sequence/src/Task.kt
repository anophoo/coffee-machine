import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next().first()
    val b = scanner.next().first()
    val c = scanner.next().first()
    println(a == b - 1 && b == c - 1)
}