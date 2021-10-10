package mx.edu.tecmm.moviles.libkotlin
/*Hacer un Script que pida el numeros de partidos ganados y empados de un equipo
de futbol y calcular cual es su puntuaje tomando en cuenta que cada partido ganado
equivale a 3 puntos y el empatado a 1, el programa tendrá que indicar el numero total
de partidos y su puntuaje.
  Autor: Rosa Icela
*/
fun main(){
    println("Ingrese número de partidos ganados: ");
    val ganados= readLine()!!.toInt();
    println("Ingrese número de partidos empatados: ");
    val empatados= readLine()!!.toInt();

    println("El número total de partidos es: ${ganados+empatados}");
    println("El puntuaje total de los partidos es: ${calcularPuntos(ganados, empatados)}")
}

fun calcularPuntos(gan: Int, emp: Int): Int{
    val puntos= (gan*3)+emp;
    return puntos;
}



