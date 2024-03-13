class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoas = listOf(
        Pessoa("Ana", 25),
        Pessoa("João", 30),
        Pessoa("Maria", 20),
        Pessoa("Pedro", 22),
        Pessoa("Carlos", 40),
    )

    val pessoasOrdenadas = pessoas.sortedBy { it.nome }

    for (pessoa in pessoasOrdenadas) {
        println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
    }
}