val dicionario = mapOf(
  "casa" to "house",
  "livro" to "book",
  "mesa" to "table",
  "cadeira" to "chair",
  "cachorro" to "dog",
  "gato" to "cat",
)

fun main() {
  val palavra = "mesa"
  val traducao = dicionario[palavra]

  if (traducao != null) {
    println("A tradução de '$palavra' é '$traducao'.")
  } else {
    println("A palavra '$palavra' não está no dicionário.")
  }
}
