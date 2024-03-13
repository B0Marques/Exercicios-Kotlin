fun ordenar(lista: List<Int>): List<Int> {
    val listaOrdenada = mutableListOf<Int>()
  
    for (numero in lista) {
      var posicao = 0
      while (posicao < listaOrdenada.size && listaOrdenada[posicao] < numero) {
        posicao++
      }
      listaOrdenada.add(posicao, numero)
    }
  
    return listaOrdenada
  }
  
  fun main() {
    val lista = listOf(5, 2, 4, 6, 1, 3)
    val listaOrdenada = ordenar(lista)
    println("Lista ordenada: $listaOrdenada")
  }
  