fun main () {
    val pair: Pair<String, Double> = Pair("Duncan", 1000.0)
    val map1 = mapOf(pair)

    map.forEach { (key, value) -> println("chave: $key - valor: $value")}

    val map2 = mapOf(
        "Lincoln" to 2500.0,
        "Dunkin" to 5000.0
        )

    map2.forEach { k, v -> println("chave: $k - valor: $v")}
}