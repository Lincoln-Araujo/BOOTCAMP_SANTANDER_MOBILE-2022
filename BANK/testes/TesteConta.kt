package testes

import Conta

fun main() {
    val contaDuncan = Conta(
        numero = "13444-5",
        agencia = "0857"
    )

    println(contaDuncan)

    try {
        contaDuncan.saque(10.0)
    } catch (e: Exception) {
        println(e.message)
        contaDuncan.deposito(150.0)
    }

    println(contaDuncan)
}