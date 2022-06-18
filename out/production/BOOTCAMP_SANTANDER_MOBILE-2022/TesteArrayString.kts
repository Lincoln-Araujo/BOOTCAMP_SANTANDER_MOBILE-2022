fun main()  {
    val nomes = Array(3) {""}
    nomes[0] = "Duncan"
    nomes[1] = "Lincoln"
    nomes[2] = "Dunkin"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Duncan", "Lincoln", "Dunkin")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}