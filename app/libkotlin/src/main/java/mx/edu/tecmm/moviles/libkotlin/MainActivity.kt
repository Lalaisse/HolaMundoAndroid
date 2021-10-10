package mx.edu.tecmm.moviles.libkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Esto debe estar después de aparecer el contenido
        val numContador: TextView = findViewById(R.id.numContador);
        var num: Int=0;
        var aumentar= true;
        numContador.text= "0";
        val boton: Button= findViewById(R.id.btnAumentar);
        val boton2: Button= findViewById(R.id.btnLimpiar);

        boton.setOnClickListener {
            Log.e("MIAPP", "Se presionó el boton") //Para debuguear se usa d, la e es de error
            if (num < 10){
                if (aumentar){
                    num++;
                }else if (!aumentar && num>0){
                    num--;
                }else {
                    aumentar=true;
                    num++;
                }
            }else if (num==10) {
                aumentar= false;
                num--;
            }
            numContador.text= num.toString()
        }
        boton2.setOnClickListener {
            num=0;
            numContador.text= num.toString()
        }
    }
}