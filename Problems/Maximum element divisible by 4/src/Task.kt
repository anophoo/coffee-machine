import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var maxValue: Int = 0
    repeat(n) {
        val k = scanner.nextInt()
        if (k > maxValue && k % 4 == 0) {
            maxValue = k
        }
    }
    println(maxValue)
}