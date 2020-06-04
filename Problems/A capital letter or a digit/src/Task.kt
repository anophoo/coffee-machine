import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val a = scanner.next().first()
    println(a.isLetter() && a.isUpperCase() || a.isDigit() && a != '0')
}