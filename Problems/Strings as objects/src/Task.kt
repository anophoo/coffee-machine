fun main() {
    val input = readLine()!!
    // write code here
    when {
        input.length != 0 && input[0] == 'i' -> {
            println(input.drop(1).toInt() + 1)
        }
        input.length != 0 && input[0] == 's' -> {
            println(input.drop(1).reversed())
        }
        else -> {
            println(input)
        }
    }
}