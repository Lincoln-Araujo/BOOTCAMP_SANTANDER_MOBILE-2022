fun main(){
    val duncan = Funcionario("Duncan", 1000.0)
    val lincoln = Funcionario("Lincoln", 3000.0)
    val dunkin = Funcionario("Dunkin", 5000.0)

    val funcionarios = listOf(duncan, lincoln, dunkin)

    funcionarios.forEach { println(it) }

    println("______________")

    println(funcionarios.find{it.nome == "dDnkin"})
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