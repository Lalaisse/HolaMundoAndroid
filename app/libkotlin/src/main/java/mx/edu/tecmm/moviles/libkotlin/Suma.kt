package mx.edu.tecmm.moviles.libkotlin
/*Hacer un Script que permita pedir dos numeros y sumarlos
  Autor: Rosa Icela
*/
fun main(){
    println("Ingrese un número");
    val n1= readLine()!!.toInt();
    println("Ingrese otro número");
    val n2= readLine()!!.toInt();
    println("La suma de los números es: ${sumar(n1,n2)}");
}
fun sumar(n1: Int, n2: Int)= n1+n2;