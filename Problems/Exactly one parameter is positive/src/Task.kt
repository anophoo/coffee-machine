import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(a > 0 && b <= 0 && c <= 0 || a <= 0 && b > 0 && c <= 0 || a <= 0 && b <= 0 && c > 0)
}