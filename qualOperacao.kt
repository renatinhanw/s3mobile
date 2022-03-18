fun calcula(n1: Int, n2: Int, n3: String) {
    if (n3 == "soma") {
        var resultado = n1 + n2
        println("$resultado")

    } else if (n3 == "subtração") {
        var resultado = n1 - n2
        println("$resultado")

    } else if (n3 == "multiplicação") {
        var resultado = n1 * n2
        println("$resultado")

    } else if (n3 == "divisão") {
        var resultado = n1 / n2
        println("$resultado")

    } else {
        println("Triste :/")
    }
}

fun main() {

    var n = calcula(5, 2, "divisão")
    println(n)
}