fun main() {
    var conteo: Int = 34
    val texto: String = validar(conteo)
    
    println(texto)
}

fun validar(x: Int) :String {
    if (x == 42){
        return "Tengo la respuesta"
    } else if (x > 35) {
        return  "La respuesta esta cerca"
    } else {
        return "La respuesta me elude"
    }
    
}


///------------------------------------
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() { 
    var mustang:Carro = Carro()
    mustang.marca="Ford"
    mustang.setRuedas(4)
    
    println("Marca: "+mustang.marca)
    println("Nro de Ruedas: "+mustang.getRuedas())
}

class Carro(){
    public var marca:String=""
    private var nroRuedas:Int=0
    
    public fun setRuedas(n: Int){// asignar a un atributo
        this.nroRuedas=n
    }
    public fun getRuedas():Int{//obtener el valor almacenado en el atributo
        return this.nroRuedas
    }
    
}