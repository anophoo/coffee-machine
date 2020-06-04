import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var length = 0
    var k = scanner.nextInt()
    while (k != 0) {
        length++
        k = scanner.nextInt()
    }
    println(length)
}