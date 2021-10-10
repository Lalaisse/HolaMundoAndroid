package mx.edu.tecmm.moviles.libkotlin

/**
 * Realice un algoritmo que lea la hora en notación 0 a 23 hrs y el resultado sea en
 * notación de 12 horas
 * Autor: Rosa Icela
 */
fun main(){

    println("Ingrese la hora (ejemplo: 13:45)")
    val hora= readLine().toString();
    println("La hora en formato de 12 horas es: ${cambiarFormato(hora)}")
}

fun cambiarFormato(hora: String):String{
    var meridiano: String;
    if ((hora.substring(0,2))!!.toInt()>12){
        meridiano="p.m.";
        val horaF= "${((hora.substring(0,2))!!.toInt()-12).toString()}:${hora.substring(3,5)}"
        return "${horaF} ${meridiano}"
    }else{
        meridiano="a.m";
        return "${hora} ${meridiano}"
    }
}