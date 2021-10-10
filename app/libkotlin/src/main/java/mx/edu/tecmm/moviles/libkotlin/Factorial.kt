package mx.edu.tecmm.moviles.libkotlin

/**
 *Programa que obtenga la factorial de un número leído
 * Autor: Rosa Icela
 */

fun main(){
    println("Ingrese un número");
    val numero= readLine()!!.toInt();
    println("El factorial del número es: ${calcularFactorial(numero)}")

}

fun  calcularFactorial(num: Int): Int{
    var factorial=1;
    for (i in 1..num){
        factorial= factorial*i;
    }
    return factorial;
}
