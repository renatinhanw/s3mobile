// AC 03 – DESENVOLVIMENTO MOBILE

// 1 –  
val reajuste = 1.095f

fun nValor(sal: Double):Double{
   var new = sal * reajuste
   return new
}
fun main() {
   var valor = 4553.32
   var x = nValor(valor)
   println("O salário que era de ${valor} recebeu um aumento de 9,5% e passou para: ${x}") 
}



// 2 – 
class Aluno(id: Int, nome: String, curso: String){
    val id: Int
    val nome: String
    val curso: String
    
    init{
        this.id = id
        this.nome = nome
        this.curso = curso
    }
}

fun main(){
    val aluno1 = Aluno(211111, "Aluno do grupo", "ADS")
    val aluno2 = Aluno(210000, "Outro aluno do grupo", "ADS")
    
    println(aluno1.id)
    println(aluno1.nome)
    println(aluno1.curso)
    println("***************")
    println(aluno2.id)
    println(aluno2.nome)
    println(aluno2.curso)
}



// 3 – 
class Aluno(){
    var id: Int
    var nome: String
    var curso: String
    
    init{
        this.id = 100 
        this.nome = "abc"
        this.curso = "si" 
        
      	println("Mostrando os parâmetros")
        println(this.id)
        println(this.nome)
        println(this.curso)
        println("***************")      
 }
    
    companion object Test {    
    fun imprime() = println("Chamando método estático " + "\n" + "****************")
    } 
}

fun main(){
    // Para mostrar os parâmetros, instanciando a classe
    var aluno1 = Aluno() 
    
    // chama o método estático
    Aluno.imprime()
}

// 4. 
// FORMA 1:
class Aluno(){
}

class Turma(){
}

class Professor(){
}


fun main(){    
    var objeto: Any? = null 
    objeto = Aluno()
	if (objeto is Aluno) {
        println("É um objeto da classe Aluno")
    } else if (objeto is Turma) {
        println("É um objeto da classe Turma")
    } else if (objeto is Professor) {
        println("É um objeto da classe Professor")
    }
 }

// Forma 2:
class Aluno(id: Int, nome: String, curso: String){
    val id: Int
    val nome: String
    val curso: String
    
    init{
        this.id = id
        this.nome = nome
        this.curso = curso
    }
}

class Turma(id: Int, nome: String, periodo: String){
    val id: Int
    val nome: String
    val periodo: String
    
    init{
        this.id = id
        this.nome = nome
        this.periodo = periodo
    }
}


class Professor(id: Int, nome: String, disciplina1: String, disciplina2: String){
    val id: Int
    val nome: String
    val disciplina1: String
    val disciplina2: String
    
    init{
        this.id = id
        this.nome = nome
        this.disciplina1 = disciplina1
        this.disciplina2 = disciplina2
    }
}


fun main(){    
    val objeto = Aluno(2101, "Alguem", "SI")    
    val objeto1 = Professor(1258, "Professor1258", "Des. Mobile", "Des. API")
    val objeto2 = Turma(3, "A", "N")
    
    println("--------------------------")
    System.out.println("objeto é da Classe: ${objeto.javaClass.name}")
    println("Nome: ${objeto.nome} é um objeto da classe ${objeto::class.simpleName}")
    println("--------------------------")
    System.out.println("objeto1 é da Classe: ${objeto1.javaClass.name}")
    println("Nome: ${objeto1.nome} é um objeto da classe ${objeto1::class.simpleName}")
    println("--------------------------")
    System.out.println("objeto2 é da Classe: ${objeto2.javaClass.name}")
    println("Turma: ${objeto2.nome} é um objeto da classe ${objeto2.javaClass.name}")
    println("--------------------------")
 }

// 5. 
// PELA FORMA 1:
class Aluno(){
}

class Turma(){
}

class Professor(){
}

fun main(){    
    var objeto: Any? = null 
    objeto = Aluno()
    objeto = Turma()
	if (objeto is Aluno) {
        println("É um objeto da classe Aluno")
    } else if (objeto is Turma) {
        println("É um objeto da classe Turma")
    } else if (objeto is Professor) {
        println("É um objeto da classe Professor")
    }
}

// FORMA 2:
class Aluno(id: Int, nome: String, curso: String){
    val id: Int
    val nome: String
    val curso: String
    
    init{
        this.id = id
        this.nome = nome
        this.curso = curso
    }
}

class Turma(id: Int, nome: String, periodo: String){
    val id: Int
    val nome: String
    val periodo: String
    
    init{
        this.id = id
        this.nome = nome
        this.periodo = periodo
    }
}


class Professor(id: Int, nome: String, disciplina1: String, disciplina2: String){
    val id: Int
    val nome: String
    val disciplina1: String
    val disciplina2: String
    
    init{
        this.id = id
        this.nome = nome
        this.disciplina1 = disciplina1
        this.disciplina2 = disciplina2
    }
}


fun main(){
    val objeto = Turma(3, "A", "N")    
   
    System.out.println("objeto é da Classe: ${objeto.javaClass.name}")
    println("--------------------------")
    println(objeto.nome)
    println("Nome Turma: ${objeto.nome} é um objeto da classe ${objeto::class.simpleName}")
    println("Período: ${objeto.periodo} é um objeto da classe ${objeto.javaClass.name}")
}


// 6. 
class Aluno(id: Int, nome: String, semestre: String){
    val notas = arrayListOf<Double>()
    init{
        notas.add(7.89)
        notas.add(6.55)
        notas.add(10.0)
        notas.add(9.75)
        notas.add(1.75)
        notas.add(9.45)
        notas.add(8.47)
        notas.add(0.0)
        notas.add(9.99)
        notas.add(6.98)
        
        mostraNotas(notas, id, nome, semestre)
    }
   fun <T> mostraNotas(notas: ArrayList<T>, id: Int, nome: String, semestre: String){
       var nota: Double = 1.00
       	   println("Aluno com RA $id, de nome $nome, do semestre $semestre, está com as notas abaixo:")
       
       for (nota in notas){
           println(nota) 
       }
   }
}


fun main() {
    var notasAluno = Aluno(210000, "Aluno do grupo", "3")
}


// 7. 
class Car(){
    var modelo:String = "Fiat"
    var ano:Int = 1900
    var velocidade:Int = 35
}

fun main(){
    var c0: Car	
    var c1: Car = Car()
    var c2: Car = Car()
    
    c0 = Car()
    c2.ano = 2020
    
    println(c1.ano)
    println(c2.ano)
    println("*********** UM PLUS **********")
    println(c0.ano)
    println(c0.modelo)
    println(c0.velocidade)
    println(c1.ano)
    println(c1.modelo)
    println(c1.velocidade)
    println(c2.ano)
    println(c2.modelo)
    println(c2.velocidade)   
}


// 8. 
fun main(args: Array<String>) {
val soma = { x:Double, y:Double -> x / y }
println(soma(5.3,6.4))
}