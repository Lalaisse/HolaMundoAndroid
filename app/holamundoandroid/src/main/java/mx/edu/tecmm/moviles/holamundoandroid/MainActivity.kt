package mx.edu.tecmm.moviles.holamundoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Esto debe estra después de aparecer el contenido
        /*val numContador: TextView = findViewById(R.id.numContador);
        numContador.text= "0";
        val boton: Button= findViewById(R.id.btnAumentar);
        boton.setOnClickListener {
            //Lo que el botón va a hacer
            Log.e("MIAPP", "Se presiono el boton"); //Para debiguear se usa d, la e es de error
            numContador.text="Algo";
        }*/
        //Tarea agregar botón limpiar
        //y hacer funcionalidad de aumentar contador, cuando llegue a 10 se cambia en reversa, cuando llegue a 1 vuelve a aumentar
    }
}