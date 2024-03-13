fun isPalindromo(str: String): Boolean {

    val strProcessada = str.toLowerCase().replace(" ", "")

    return strProcessada == strProcessada.reversed()
}

fun main() {
    val string = "Nome"
    println(isPalindromo(string))
}
