package mx.edu.tecmm.moviles.libkotlin

/**
 * Hacer un script que pida por teclado cinco nombres y los almacene en un arreglo,
 * despues, el script tendra que solicitar una posición para leer el nombre
 * que será mostrado y imprimirá el nombre,
 * el script debe de estar validado para que el usuario sea avisado cuando una
 * posición no existe del arreglo
 * Autor: Rosa Icela
 */
fun main(){
    val nombres = arrayListOf<String>();
    for (i  in 0..4){
        print("Ingrese nombre: ");
        nombres.add(readLine()!!.toString());
    }
    print("Ingrese la posición a leer: ");
    val posicion= readLine()!!.toInt();
    when(posicion){
        in 0..4-> println("El mombre es: ${nombres[posicion]}")
        else-> println("No existe la posición")
    }
}