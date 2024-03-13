fun maiorNumero(numeros: IntArray): Int {
    var maior = numeros[0]
    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(maiorNumero(numeros))
}
