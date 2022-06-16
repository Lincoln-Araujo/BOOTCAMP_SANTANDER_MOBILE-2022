fun main() {
    println("________ CALCULADORA KOTLIN_______\n" +
            "Escolha uma operacao:\n" + "Para SOMAR, digite 1\n" +
            "Para SUBTRAIR, digite 2\n" +
            "Para MULTIPLICAR, digite 3\n" +
            "Para DIVIDIR, digite 4\n"
            )

    val escolha = readLine()!!.toInt()

            print("Digite o primeiro numero: ")
            val num1 = readLine()!!.toFloat()
            print("Digite o segundo numero: ")
            val num2 = readLine()!!.toFloat()

            when (escolha) {
                1 -> adicao(num1, num2)
                2 -> subtracao(num1, num2)
                3 -> multiplicacao(num1, num2)
                4 -> divisao(num1, num2)
            }
}

fun adicao(num1: Float, num2: Float) {
    println("O resultado da adicao e: ${num1 + num2}")
}

fun subtracao(num1: Float, num2: Float) {
    println("O resultado da subtracao e: ${num1 - num2}")
}

fun multiplicacao(num1: Float, num2: Float) {
    println("O resultado da multiplicacao e: ${num1 * num2}")
}

fun divisao(num1: Float, num2: Float) {
        println("O resultado da divisao e: ${num1 / num2}")
}



