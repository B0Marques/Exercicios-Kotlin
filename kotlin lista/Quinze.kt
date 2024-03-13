fun filtrarPares(numeros: IntArray): IntArray {
    val pares = mutableListOf<Int>()
    for (numero in numeros) {
      if (numero % 2 == 0) {
        pares.add(numero)
      }
    }
    return pares.toIntArray()
  }

  fun dobrarValores(numeros: IntArray): IntArray {
    val valoresDobrados = IntArray(numeros.size)
    for (i in numeros.indices) {
      valoresDobrados[i] = numeros[i] * 2
    }
    return valoresDobrados
  }

  fun somarValores(numeros: IntArray): Int {
    var soma = 0
    for (numero in numeros) {
      soma += numero
    }
    return soma
  }
  
  fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = filtrarPares(numeros)
    println("Números pares: ${pares.contentToString()}")

    val valoresDobrados = dobrarValores(numeros)
    println("Valores dobrados: ${valoresDobrados.contentToString()}")

    val soma = somarValores(numeros)
    println("Soma dos valores: $soma")
  }
  