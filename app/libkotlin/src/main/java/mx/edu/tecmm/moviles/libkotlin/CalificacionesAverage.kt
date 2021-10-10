package mx.edu.tecmm.moviles.libkotlin

/**
 * Hacer un Script que pida 10 calificaciones
 * y utilice el metodo average para mostrar el promedio de las calificaciones.
 * Autor: Rosa Icela
 */
fun main(){
    val calificaciones= arrayListOf<Int>();
    for (i in 1..10){
        println("Ingrese una calificación")
        calificaciones.add(readLine()!!.toInt());
    }
    println("El promedio es: ${calificaciones.average()}");
}

