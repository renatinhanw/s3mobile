fun main() {
	var n1: Double = 5.0
    var n2: Double = 5.0
    var media: Double = (n1+n2)/2
    
    if(media >=6){
        println("Aprovado")

}
    else if(media <= 6.0){
        var n3: Double = 6.0
        var mediaNova: Double = (n1+n2 + n3)/3
        if(mediaNova >= 6.0){
            println("Aprovado")
        }else{
            println("Reprovado")
        }
    }
}