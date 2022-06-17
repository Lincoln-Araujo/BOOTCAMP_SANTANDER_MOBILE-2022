package testes

import Gerente

fun main() {
    val maria = Gerente("Duncan Mathews", "1234567899", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}