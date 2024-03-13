class Funcionario(val nome: String, val idade: Int, val salario: Double)

fun funcionarioComMaiorSalario(lista: List<Funcionario>): Funcionario {
  var funcionarioComMaiorSalario = lista[0]
  for (funcionario in lista) {
    if (funcionario.salario > funcionarioComMaiorSalario.salario) {
      funcionarioComMaiorSalario = funcionario
    }
  }
  return funcionarioComMaiorSalario
}

fun main() {
  val funcionarios = listOf(
    Funcionario("João", 30, 2000.0),
    Funcionario("Maria", 25, 1800.0),
    Funcionario("Pedro", 40, 2500.0),
    Funcionario("Ana", 35, 2200.0),
  )

  val funcionarioComMaiorSalario = funcionarioComMaiorSalario(funcionarios)
  println("O funcionário com o maior salário é: ${funcionarioComMaiorSalario.nome}")
}
