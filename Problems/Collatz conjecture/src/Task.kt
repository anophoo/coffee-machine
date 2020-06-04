import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    println(n)
    while (n != 1) {
        if (n % 2 == 1) {
            n = n * 3 + 1
        } else {
            n /= 2
        }
        println(n)
    }
}