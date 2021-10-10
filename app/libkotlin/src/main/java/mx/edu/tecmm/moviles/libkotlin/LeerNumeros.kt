package mx.edu.tecmm.moviles.libkotlin

/**
 *Programa que lea una serie de números
 * y se detenga cuando el número leído sea un 0.
 * Autor: Rosa Icela
 */
fun main() {
    leerNumeros();
}

fun leerNumeros() {
    do {
        println("Ingrese un número diferente a 0");
        val num = readLine()!!.toInt();
    } while (num != 0)
}