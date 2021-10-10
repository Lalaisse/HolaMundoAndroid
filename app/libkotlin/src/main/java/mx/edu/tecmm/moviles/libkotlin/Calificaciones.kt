package mx.edu.tecmm.moviles.libkotlin

/**
 * Convertir las calificaciones alfabéticas A, B, C, D y E
 * a calificaciones numéricas 10, 9, 8, 7 y 6, respectivamente
 */

fun main(){
    var calificaciones= arrayListOf("A","B","C", "D", "E");
    for (calificacion in calificaciones){
        convertirCalificaciones(calificacion);
    }
}

fun convertirCalificaciones(cal: String){
    val calificacion= when(cal){
        "A"->10;
        "B"->9
        "C"->8
        "D"->7
        "E"->6
        else -> "Error";
    }
    println("La calificación: ${cal}, es equivalente a: ${calificacion}")
}
