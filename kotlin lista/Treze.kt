fun operacaoMatematica(num1: Double, num2: Double, funcao: (Double, Double) -> Double): Double {
    return funcao(num1, num2)
  }
  
  fun main() {
    val soma = { a: Double, b: Double -> a + b }
    val subtracao = { a: Double, b: Double -> a - b }
    val multiplicacao = { a: Double, b: Double -> a * b }
    val divisao = { a: Double, b: Double -> a / b }
  
    println("Soma: ${operacaoMatematica(2.0, 3.0, soma)}")
    println("Subtração: ${operacaoMatematica(5.0, 2.0, subtracao)}")
    println("Multiplicação: ${operacaoMatematica(4.0, 5.0, multiplicacao)}")
    println("Divisão: ${operacaoMatematica(10.0, 2.0, divisao)}")
  }
  