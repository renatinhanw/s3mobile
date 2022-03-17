fun main() {
	var nome = "Rena"
	imprimir(nome)
	val soma = somar(2, 3)
	imprimir("Soma: $soma")

	}

// recebe uma string e não retorna nada (Unit)

fun imprimir(s: String): Unit {
	println(s)
}

// Recebe 2 inteiros e retorna uma inteiro

fun somar(a: Int, b: Int): Int {
    return a + b

}