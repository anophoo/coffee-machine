import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n1 = scanner.next().toLong()
    val op = scanner.next()
    val n2 = scanner.next().toLong()
    println(when (op) {
        "+" -> n1 + n2
        "-" -> n1 - n2
        "/" -> {
            if (n2 == 0.toLong()) {
                "Division by 0!"
            } else {
                n1 / n2
            }
        }
        "*" -> n1 * n2
        else -> "Unknown operator"
    })
}