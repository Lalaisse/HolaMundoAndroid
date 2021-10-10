package mx.edu.tecmm.moviles.libkotlin
/*
    Hacer un Script que pida 5 calificaciones e imprima el promedio de las mismas
    Autor: Rosa Icela
 */

fun main(){
    val calificaciones = IntArray(5);
    for (i in 0..4 ){
        println("Ingrese calificación:");
        calificaciones[i]= readLine()!!.toInt();
    }
    println("El promedio es: ${calcularPromedio(calificaciones)}")


}
fun calcularPromedio(array: IntArray): Double{
    var suma=0;
    for (i in 0..4){
        suma += array[i];
    }
    return (suma).toDouble()/5 ;
}