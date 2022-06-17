fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }

    values.forEach{
        println(it)
    }

    for (index in values.indices) {
        println(values[index])
    }

    values.sort() // organiza o array do menor para o maior
    for (valor in values) {
        println(valor)
    }
}