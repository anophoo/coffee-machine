import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var ind = 1
    var count = 0
    repeat(n) {
        if (count == ind) {
            count = 0
            ind++
        }
        print("$ind ")
        count++
    }
}