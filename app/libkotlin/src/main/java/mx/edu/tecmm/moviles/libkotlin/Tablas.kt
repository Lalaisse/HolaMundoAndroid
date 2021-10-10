package mx.edu.tecmm.moviles.libkotlin

/**
 * Programa que despliegue las primeras 10 tablas de multiplicar
 * Autor: Rosa Icela
 */
fun main() {
    println("Tablas de multiplicar")
    println("")
    desplegarTablas();
}

fun desplegarTablas() {
    for (i in 1..10) {
        for (j in 1..10) {
            println("$i * $j = ${i * j}");
        }
        println("_____________________")
    }
}