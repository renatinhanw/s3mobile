// Comandos de repetição
fun main(){
    var valor:Int = 5
    var decremento:Int = 0
    var fatorial:Int = 1
    
    decremento = valor
    while (decremento>=1){
    	fatorial = fatorial * decremento
       	decremento = decremento-1
        }      
    println("O fatorial de, $valor, é, $fatorial")
    }