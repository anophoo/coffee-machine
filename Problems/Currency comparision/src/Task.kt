import java.util.*

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany",	"Euro"),
    MALI("Mali",	"CFA franc"),
    DOMINICA("Dominica",	"Eastern Caribbean dollar"),
    CANADA("Canada",	"Canadian dollar"),
    SPAIN("Spain",	"Euro"),
    AUSTRALIA("Australia",	"Australian dollar"),
    BRAZIL("Brazil",	"Brazilian real"),
    SENEGAL("Senegal",	"CFA franc"),
    FRANCE("France",	"Euro"),
    GRENADA("Grenada",	"Eastern Caribbean dollar"),
    KIRIBATI("Kiribati",	"Australian dollar")
}

fun exists(country: String): Boolean {
    for (enum in Country.values()) {
        if (country == enum.country) return true
    }
    return false
}

fun haveSameCurrencies(country1: String, country2: String): Boolean {
    return exists(country1) && exists(country2) &&
    Country.valueOf(country1.toUpperCase()).currency == Country.valueOf(country2.toUpperCase()).currency
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val country1 = input.next()
    val country2 = input.next()
    println(haveSameCurrencies(country1, country2))
}