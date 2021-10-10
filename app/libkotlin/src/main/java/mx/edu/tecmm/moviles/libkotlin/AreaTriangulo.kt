package mx.edu.tecmm.moviles.libkotlin
/*
    Hacer un Script que pida la base y la altura de un triangulo y calcule su Area.
    Autor: Rosa
 */
fun main(){
    println("Ingrese la medida de la base");
    val base= readLine()!!.toDouble();
    println("Ingrese la medida de la altura");
    val altura= readLine()!!.toDouble();
    println("El área del triángulo es: ${calcularArea(base, altura)}");
}

fun calcularArea(b: Double, a: Double)= (b*a)/2;