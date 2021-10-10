package mx.edu.tecmm.moviles.libkotlin

fun main(){
    println("Primera compilación ");
    print("Kotlin");
    //variables
    //var constantes: no puede cambiar su valor
    //val variables
    val a=10;
    var b=100;
    b=60;
    var nombre: String ="Rosa";
    var x: Short = 30;

    //String templates
    print("El valor de x es $x");
    print("El resultado de $a +$b es igual a ${a+b}");
    val parrafo=""";
        Esto
        es 
        un 
        texto
        con 
        espacios
        """
    print(parrafo);

    //El método onCreate se lanza parea que la ventana se muestre, solo cuando se esté creando la aplicación para lanzarse, es nuestro inicial,
    //el segundo main, el primer método que se está trabajadoo, debe heredar de Bundle para tener los datos todavía al salir de la app

    //AppCompactActivity: Parta la compativilidad
    //La R funciona para buscar un recurso en código Kotlin

}