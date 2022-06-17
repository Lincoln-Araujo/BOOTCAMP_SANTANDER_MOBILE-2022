package testes

import Analista

fun main() {
    val duncan = Analista("Duncan", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(duncan)
}