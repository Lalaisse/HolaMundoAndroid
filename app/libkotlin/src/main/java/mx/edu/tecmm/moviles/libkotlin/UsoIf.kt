package mx.edu.tecmm.moviles.libkotlin

/**
 * Realiza un programa que permita leer la edad de una persona y despliegue en
pantalla si es menor o mayor de edad.
 * Autor: Rosa Icela
 */
fun main(){
    var estatusEdad: String?; //El símbolo para que avise sobre un posible nullPointerExepttion
    // se pueden modificar en cualquier parte del programa
    println("Dame la edad de la persona");
    val edad= readLine()!!.toInt();//solo se puede modificar al inicializar o en constructores

    if (edad>18){
        estatusEdad="mayor de edad";
    }else{
        estatusEdad="menor de edad";
    }
    println("Es una persona $estatusEdad");//StringTemplate para concatenar
}

