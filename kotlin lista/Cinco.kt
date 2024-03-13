val maior = { a: Int, b: Int -> if (a > b) a else b }

fun main() {
    val num1 = 8
    val num2 = 80

    val maiorNumero = maior(num1, num2)
    println("O maior número entre $num1 e $num2 é $maiorNumero")
}
