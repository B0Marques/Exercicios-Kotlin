fun String.isPalindromo(): Boolean {
    val textoSemEspaco = this.replace(" ", "")
    val textoMinusculo = textoSemEspaco.toLowerCase()
    return textoMinusculo == textoMinusculo.reversed()
  }
  
  fun main() {
    val palavras = listOf("ovo", "arara", "radar", "asa", "nome")
  
    for (palavra in palavras) {
      if (palavra.isPalindromo()) {
        println("A palavra '$palavra' é um palíndromo.")
      } else {
        println("A palavra '$palavra' não é um palíndromo.")
      }
    }
  }
  