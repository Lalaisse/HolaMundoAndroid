package mx.edu.tecmm.moviles.libkotlin

/**
 * Fundamentos de POO
 */
class Persona(var nombre:String, var domicilio: String="Conocido") {//Valores definidos a los que se declaran en el constructor//Aquí se declara el constructor en la misma clase //Es final por default

    //var nombre: String=""; //En Kotlin ya tiene el get y set implícitos, aquí no se instncian manualmente
    //Los POJO son archivos en texto plano, para guardar información con get y set
    fun datos(){
        println("El nombre es $nombre");
        println("El domicilio es $domicilio")
    }
}
data class Referencias(var domicilio:String, var referencia:String){//El tipo de clase especial para almacenar atrubutos se llama data Class es un POJO ya definido es final por definición
    //Se usa data class cuando solo tendra
    //Final significa que costará en herencia
}

open class ClaseA{ //Le quita el final para que se pueda heredar de ella
    var uno:Int=10;
    open fun metodo(){ //para indicar que se está sobreescribiendo
        println("Algo");
    }
}
/*
Herencia
 */
class ClaseB: ClaseA(){
    fun variable(){
        println("El valor de var es $uno")
    }
    override fun metodo(){
        println("XXX")
    }
}
fun main(){
    /*val persona= Persona("Rosita","Potrero"/*nombre="Rosa"*/); //Para instanciar un objeto
    //persona.nombre="Rosita";
    persona.datos();
    val obj= Referencias("Uno", "Dos");
    println(obj)*/

    /*
    Herencia
     */
    /*val obj=ClaseB();
    obj.variable();
    obj.metodo();*/

    /*
    Interfaces
     */
    val obj= Eventos();
    obj.clickListener();
    //fun
    var obj1= ClickListener {
        println("Lo que quiero hacer")
    }
    obj1.clickListener();
}

//Interfaces

fun interface ClickListener{//Clase abstracta que debe ser sobreescrita, //SAM son las interfaces que tienen un sólo método
    fun clickListener();//Con fun se dice que una interface se puede hacer un método single
}

class Eventos: ClickListener{//Implements y extends se usan dos puntos solamente
    override fun clickListener() {
        println("Presioné algo")
    }
}