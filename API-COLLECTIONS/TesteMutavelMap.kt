
fun main() {
    val duncan = Funcionario("Duncan", 10000.0, "PJ")
    val lincoln = Funcionario("Lincoln", 8000.0, "CLT")
    val dunkin = Funcionario("Dunkin", 9000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(duncan.nome, duncan)
    repositorio.create(lincoln.nome, lincoln)
    repositorio.create(dunkin.nome, dunkin)

    println(repositorio.findById(duncan.nome))

    println("__________")
    repositorio.findAll().forEach { println(it)}
}