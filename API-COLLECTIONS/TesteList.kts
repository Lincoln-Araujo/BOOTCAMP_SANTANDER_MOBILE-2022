fun main(){
    val duncan = Funcionario("Duncan", 10000.0)
    val lincoln = Funcionario("Lincoln", 8000.0)
    val dunkin = Funcionario("Dunkin", 9000.0)

    val funcionarios = listOf(duncan, lincoln, dunkin)

    funcionarios.forEach { println(it) }

    println("______________")

    println(funcionarios.find{it.nome == "Dunkin"})

    println("______________")
    // imprimindo uma lista organizada do menor salario para o maior
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}