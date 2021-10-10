package mx.edu.tecmm.moviles.libkotlin

/**
 * When en como un switch mejorado
 */
fun main(){
    println("Dame una caalificación:");
    val calf= readLine()!!.toInt();

   /* when(calf){
        10-> {
            println("Excelente calificación");
            println("Felicidades")
        }
        9-> println("Buena calificación")
        else ->("No hay calificación");
    }

    val resultado= when(calf){
        10-> {
            ("Excelente calificación");
            ("Felicidades")
        }
        9-> ("Buena calificación")
        else ->"No hay calificación";
    }*/

    val estatus= when(calf){
        in 90..100 -> "Excelente";
        in 80..89-> "Bueno";
        else -> "Casi pasó"
    }
    println("El último que dice es $estatus");

}