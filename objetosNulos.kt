fun escreve(nome:String,  sNome:String?=null, faculdade:String="Impacta"){
    if (sNome!=null){
     print(" $sNome") 
    }
    
    if (faculdade!=null){       
     print(" - $faculdade")    
    }
	println(" >>>") 
}

fun main(){       
    escreve("José","Silva","GV")  
    escreve("João","Silveira")    
    escreve("Ana")    
    escreve("Paula",faculdade="USP")  
}