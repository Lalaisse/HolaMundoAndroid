package mx.edu.tecmm.moviles.libkotlin

fun main() {
    var nombre = "Rosa";
    var numero = "100";
    var puesto = "Alumno";

    /*//Crear arreglos
    var datos = arrayListOf<String>();
    //Agregar valores
    datos.add(nombre);
    datos.add(puesto);
    datos.add(numero);

    println(datos);

    var dias = listOf("Lunes", "Martes");
    datos.addAll(dias);
    println(datos);

    //Modificación de elementos
    datos[1] = "Alumno";
    datos.set(3, "Posición 3 modificada");
    println(datos)

    //Remover algun valor
    datos.removeAt(1);
    println(datos)

    //Recortrer todos los elementos
    for (elemento in datos) {
        println(elemento);
    }
    datos.forEach {
        println("El elemento es $it")
    }

    // Operaciones
    println("El arreglo tiene ${datos.count()} valores")
    //Borrar
    datos.clear();
    println("El arreglo tiene ${datos.count()} valores")*/

    var califs= listOf(80,70,90,100);
    println(califs);
    var califsModificado= califs.plus(60);
    println(califsModificado);
    //Excluir uno
    println(califsModificado.minus(90));
    //Ordenar
    println(califsModificado.sorted());
    //Valor máximo
    println(califsModificado.maxOrNull());
    //Imprimir el promedio
    println(califsModificado.average());
    //Recorrer
    califsModificado.forEach {
        println("Formato de 0 a 10: ${it/10}");
    }

}