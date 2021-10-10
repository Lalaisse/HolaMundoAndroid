package mx.edu.tecmm.moviles.libkotlin
/*
Hacer un Script que pida una cantidad en dinero en pesos y lo convierta a su
equivalente en dolar tomando en cuenta el cambio a 20.95 (utilice val)
Autor: Rosa Icela
 */
fun main(){
    println("Ingrese una cantidad de pesos mexicanos: ");
    val pesos= readLine()!!.toInt();
    println("La cantidad tiene un equivalente a ${calcularDolares(pesos)} dólares")
}

fun calcularDolares(pesosMexicanos: Int)= pesosMexicanos/20.95;
