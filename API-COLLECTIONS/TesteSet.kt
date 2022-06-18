fun main() {
    val duncan = Funcionario("Duncan", 10000.0, "PJ")
    val lincoln = Funcionario("Lincoln", 8000.0, "CLT")
    val dunkin = Funcionario("Dunkin", 9000.0, "PJ")

    val funcionarios = setOf(duncan, lincoln)
    val funcionarios2 = setOf(dunkin)

    // unindo list
    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach {println(it)}

    println("__________")
    val funcionarios3 = setOf(duncan, lincoln, dunkin)
    // achar um elemento de um subconjunto dentro de um outro conjunto
    // neste caso, procuramos os elementos do subconjunto funcionarios 2
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {println(it)}

    println("__________")
    // acha um elemento em comum entre os conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it)}
}

