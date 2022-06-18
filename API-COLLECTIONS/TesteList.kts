fun main(){
    val duncan = Funcionario("Duncan", 10000.0, "PJ")
    val lincoln = Funcionario("Lincoln", 8000.0, "CLT")
    val dunkin = Funcionario("Dunkin", 9000.0, "PJ")

    val funcionarios = listOf(duncan, lincoln, dunkin)

    funcionarios.forEach { println(it) }

    println("______________")

    println(funcionarios.find{it.nome == "Dunkin"})

    println("______________")
    // imprimindo uma lista organizada do menor salario para o maior
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("______________")
    // imprimindo uma lista organizada de acordo com o tipo de contratacao
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach {println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}