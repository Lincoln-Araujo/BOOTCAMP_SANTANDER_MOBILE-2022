fun main() {
    val duncan = Funcionario("Duncan", 10000.0, "PJ")
    val lincoln = Funcionario("Lincoln", 8000.0, "CLT")
    val dunkin = Funcionario("Dunkin", 9000.0, "PJ")

    val funcionarios = mutableListOf(duncan, dunkin)
    funcionarios.forEach {println(it)}

    println("____________")
    funcionarios.add(lincoln)
    funcionarios.forEach { println(it)}

    println("____________")
    funcionarios.remove(dunkin)
    funcionarios.forEach { println(it) }

    println("_____________")
    val funcionariosSet = mutableSetOf(duncan)
    funcionariosSet.add(lincoln)
    funcionariosSet.add(dunkin)
    funcionariosSet.forEach{println(it)}

    println("____________")
    funcionariosSet.remove(dunkin)
    funcionariosSet.forEach { println(it)}
}

