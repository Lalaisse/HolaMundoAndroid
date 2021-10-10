package mx.edu.tecmm.moviles.libkotlin

fun main(){
    println("Dame un numero:");
    val num1= readLine()!!.toInt()
    println("Dame otro número:");
    val num2= readLine()!!.toInt()
    println("El resultado es ${hacerSuma(num1, num2)}");
    println("El resultado es ${hacerSumaSimple(num1, num2)}");

}

fun hacerSuma(num1: Int, num2: Int): Int{
    val resultado= num1+num2;
    return resultado;
}

fun hacerSumaSimple (num1: Int, num2: Int)= num1+num2;