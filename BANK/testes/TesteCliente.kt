package testes

import Cliente
import ClienteTipo

fun main() {
    val duncan = Cliente(
        nome = "Duncan Matthews",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(duncan)

    TesteAutenticacao().autentica(duncan)
}