/* 

1. Inicialize o ano de nascimento e o ano atual. Calcule e mostre a sua idade e  quantos anos terá daqui a 25 anos. 

*/

fun main() {
    var ano = 2022
    var ano_nasc = 2001
    var idade_atual = ano - ano_nasc
    var idade_futura = idade_atual + 25
    println(idade_atual)
    println(idade_futura)
    }
/* 

2. Inicialize o dia, mês e ano de nascimento e apresente cada uma das variáveis  em console. Apresente também os valores concatenados no formato  DD/MM/YYYY.

*/  

fun main() {
   var dia = 15
   var mes = 12
   var ano = 2001
   var resultado = "Data de nascimento é: $dia/$mes/$ano"
    
   println(resultado)
   
}

/* 

3. Receba os valores em x e y. Efetua a troca de seus valores e mostre seus  conteúdos. 

*/

fun Conteudo(){
   var x = 20
   var y = 10
   println("X = ${x} e Y = ${y}")
   var z = 0
   z = x
   x = y
   y = z
   println("X = ${x} e Y = ${y}")
}
fun main() {
Conteudo()
}

/*

4. Receba o valor de um depósito em poupança. Calcule e mostre o valor após  1 mês de aplicação sabendo que rende 1,3% a. m.

 */

fun RendPou(){
	var valor_depos = 1000
    var rendimento = 0.013

    var valor_rend_men = valor_depos * rendimento
    var rend_mensal = valor_depos + valor_rend_men
    
    println(rend_mensal)      
}
fun main() {
    RendPou()
}

/* 
5. Inicialize o salário atual, calcule o novo salário acrescido de 20%. 

 */

fun AumSalarial(){
    var salar_atual = 2145
    var aumento = 0.2
    
    var salar_aument =salar_atual * aumento
    var salario_oficial = salar_aument + salar_atual
    println (salario_oficial)
}

fun main(){
    AumSalarial()
}

// 6. Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas é  maior do que 1000 ou menor do que 100. Exiba qual é a variável que está dentro  do range. 
fun CompararVar(){
    var a = 55
    var b = 551
    var c = 1540    
    if(a > 100 && a < 1000){
        println(a)
    }
    if(b> 100 && b< 1000){
        println(b)    
    }
    if(c> 100 && c < 1000){
        println(c)
   }
}

fun main(){
    CompararVar()
}
// 7. Inicialize dois valores, calcule e apresente a diferença do maior pelo menor.
fun CalculoDif(){
    var a = 5
    var b = 10
    
    if(a > b){
        var dif1 = a - b
        println ("O valor de ${a} é maior que o valor de ${b}, a diferença entre eles é: $dif1")
    } else {
        var dif2 = b - a
        println ("O valor de ${b} é maior que o valor de ${a}, a diferença entre eles é: $dif2")
    }
   
}

fun main(){
    CalculoDif()
}

// 8. Inicialize as notas dos alunos, N1, N2 e N3. Verifique se a média das três é  maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi  aprovado. Senão Inicialize uma nova nota N4 e verifique se o aluno foi aprovado.
 fun MediaAlu(){
    var N1 = 2
    var N2 = 6
    var N3 = 9
    var media = (N1 + N2 + N3) / 3
    var N4 = 6
    
when { 
media < 2-> println("Recuperação")  
media < 6 -> println("Aprovado")
else -> println("Aprovado com $N4")
}        
  }

fun main(){
    MediaAlu()
}
// 9. Inicialize uma variável contendo o salário atual e outra variável contendo a  opção que será acessada no menu. Para opção 1 deve ser acrescido 30% no  salário, para opção 2 deve ser acrescido 40% no salário, para opção 3 deve ser  acrescido 50% no salário e para a opção 4 deve ser acrescido 60% no salário.  Exiba o valor reajustado. 
fun AddSalario() {
    var salario = 1500
    var escolha = 1
    if(escolha == 1 ){
        var aumento = 0.3
        var valorAumento  = salario * aumento
        var salarioFinal = salario + valorAumento
    println("Opção 1")
    println("O valor base do salário é: R$ ${salario}")
    println("O valor de aumento é: R$ ${valorAumento}")
    println("O valor final do salário será: R$ ${salarioFinal}")
    } else if(escolha == 2){
    var aumento = 0.4
    var valorAumento = salario * aumento
    var salarioFinal = salario + valorAumento
    println("Opção 2")
    println("O valor base do salário é: R$ ${salario}")
    println("O valor de aumento é: R$ ${valorAumento}")
    println("O valor final do salário será: R$ ${salarioFinal}")
    } else if (escolha == 3){
    var aumento = 0.5
    var valorAumento = salario * aumento
    var salarioFinal = salario + valorAumento
    println(" Opção 3")
    println("O valor base do salário é: R$ ${salario}")
    println("O valor de aumento é: R$ ${valorAumento}")
    println("O valor final do salário será: R$ ${salarioFinal}")
    } else if (escolha == 4) {
        var aumento = 0.6
        var valorAumento = salario * aumento
        var salarioFinal = salario + valorAumento
    println("Opção 4")
    println("O valor base do salário é: R$ ${salario}")
    println("O valor de aumento é: R$ ${valorAumento}")
    println("O valor final do salário será: R$ ${salarioFinal}")
    }
}

    fun main() {
    AddSalario()
    }
// 10. Calcule e mostre o quadrado dos números entre 40 e 200 dos números  inteiros pares.
 fun Pares(){
    var x = 40
    while(x < 200){
        if(x % 2 ==0){
       }
       x++
        
     var quadrado = x*x
        println("O numero quadrado de $x é $quadrado")
}
}
    
    
 fun main(){
     Pares()
 }
  
// 11. Calcule e mostre a soma dos números pares e quantidade de números  ímpares entre 1 e 800.
 fun ParesXimpar(){
    var x = 1
    var impar = 0
    var par = 0
    
    while(x <=800){
          x++
        if(x % 2 ==0){
            par = par + x
       }
        else {
            impar++
        }
     
        
        println("Quantidade números impares: $impar")
        println("Soma número pares: $par ")
        
}
}
    
    
 fun main(){
     ParesXimpar()
 }
 
// 12. Inicialize um número que conterá o final da iteração. Apresente em console  todos os valores de 1 ao número inicializado que são divisíveis por 5.
 fun interacao (){
    var ini = 1
	var fin = 100
    
    while (ini <= fin){
        if(ini % 5 == 0){
            println(ini)
        }
        
        ini++
    }
          
}

fun main (){
 interacao()
}
 
// 13. Inicialize um vetor de 10 posições e exiba cada um dos elementos em  console.
fun Vetor(){
    val elemento = intArrayOf(1,2,3,4,5,6,7,8,9,10,11)
    for (x in elemento){
        println(x)
    }
}

fun main(){
    Vetor()
}
 
// 14. Passe 4 parâmetros nulos para uma função e verifique quais dos valores  fornecidos não são nulos, exibindo-os em console. Realize 4 chamadas simples  a partir da função main, em que uma delas deve conter a especificação do valor  para um dado parâmetro.
fun main () {
    var n1:Int? = null
    var n2: Int? = null
    var n3: Int? = 10
    var n4:Int? = null
    verifica_nulo(n1)
    verifica_nulo(n2)
    verifica_nulo(n3)
    verifica_nulo(n4)
    }
    
    fun verifica_nulo(numero: Int?){
        if(numero!= null){
            println("O valor da variável é $numero")
        }else{ println("O valor da variável é $numero")
    }
    }

/*
15) Explique cada um dos conceitos abaixo aplicáveis no Kotlin: 
• Kotlin Unit 
• Operadores ternários 
• Modularização e principais vantagens 
• Formas de passagem de parâmetros em Kotlin • Operações Seguras 
• Tipagem do Kotlin (fracamente tipada ou fortemente tipada)

Kotlin Unit: trata-se de um tipo com um único valor,  unitário; é também o equivalente ao void do java

Operadores ternários: verifica uma condição e retorna um dentre dois valores pré-definidos em uma estrutura. Esta é uma notação chamada inline para às vezes em que seja necessário avaliar expressões e decidir um, entre dois valores.

Modularização e principais vantagens: 

Módulo: coleção de arquivos de origem e configurações de build que permite dividir o projeto em unidades distintas de funcionalidade, sendo que nosso projeto pode ter um ou mais módulos, e cada um desses módulos pode usar outro como dependência. Além disso, podemos criar, testar e depurar cada módulo de forma independente.

Exemplos de módulos: Módulo de app Android,Módulo do recurso,Módulo de biblioteca,Módulo do Google Cloud.

Vantagens: facilita a detecção de erros, pois é, em princípio, simples qual é o módulo responsável pelo erro, é mais fácil testar os módulos individualmente do que o programa todo, assim como também é mais fácil fazer a manutenção desses módulos, permite o desenvolvimento independente de mais módulos.

Formas de passagem de parâmetros em Kotlin: usamos val para uma constante ou a palavra-chave ou var para declarar uma variável. Especificamos os tipos como sitring ou int, depois do nome da variável

Exemplo: declaração de uma constante:
[imagem] 

Recomenda-se que você comece fazendo suas variáveis imutáveis, declarando-as com a palavra-chave do val para não manter muitos estados. Isso torna seu código mais seguro para multithreading, porque garante que suas variáveis não podem ser modificadas por outras threads inesperadamente.
Em Java, é possível declarar múltiplas variáveis do mesmo tipo em uma única linha, mas isso não funciona no Kotlin. Em Kotlin, todas as declarações de variável devem estar em suas próprias linhas.

Operações Seguras: O operador de chamada segura ajuda a ter menos código para fazer a validação de variável nula:
[imagem]

Tipagem do Kotlin (fracamente tipada ou fortemente tipada): Linguagem fortemente tipada.

 */