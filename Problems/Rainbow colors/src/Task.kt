import java.util.Scanner

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color == enum.color.toUpperCase()) return true
    }
    return false
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val color = input.next().toUpperCase()
    println(isRainbow(color))
}