fun maiorString(lista: List<String>): String {
    var maior = lista[0]
    for (str in lista) {
      if (str.length > maior.length) {
        maior = str
      }
    }
    return maior
  }
  
  fun main() {
    val lista = listOf("banana", "maçã", "laranja", "melancia")
    val maiorString = maiorString(lista)
    println("A string mais longa é: $maiorString")
  }
  