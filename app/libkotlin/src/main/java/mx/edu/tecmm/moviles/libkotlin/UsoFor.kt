package mx.edu.tecmm.moviles.libkotlin

fun main(){
    println("Lista de números");
    for (i in 1..100){
        println("El numero es $i");
    }

    val estados = listOf("Jalisco", "Michoacan");
    for (estado in estados){
        println("el estado es $estado")
    }
}
