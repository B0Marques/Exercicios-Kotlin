class ContaBancaria(var saldo: Double, val limite: Double) {

    fun saque(valor: Double): Double {
      if (valor > saldo + limite) {
        throw Exception("Saldo insuficiente")
      }
        this.saldo -= valor
        return saldo
    }
  
    fun deposito(valor: Double): Double {
        this.saldo += valor
        return saldo
    }
  
    fun consultaSaldo(): Double {
      return saldo
    }
  }
  
  fun main() {
    val conta = ContaBancaria(100.0, 200.0)
  
    try {
      val novoSaldo = conta.saque(150.0)
      println("Novo saldo: $novoSaldo")
    } catch (e: Exception) {
      println("Erro ao realizar saque: ${e.message}")
    }

  }
  