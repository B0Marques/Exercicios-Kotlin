fun stringsComecandoComA(lista: List<String>): List<String> {
    return lista.filter { it.startsWith("A", ignoreCase = true) }.sorted()
}

fun main() {
    println(stringsComecandoComA(listOf("a", "b", "c", "A", "B", "C")))
}
