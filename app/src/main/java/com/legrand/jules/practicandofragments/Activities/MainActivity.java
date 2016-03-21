package com.legrand.jules.practicandofragments.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.legrand.jules.practicandofragments.EnviarMensaje;
import com.legrand.jules.practicandofragments.Fragments.Derecha;
import com.legrand.jules.practicandofragments.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha)getFragmentManager().findFragmentById(R.id.derecha);
        derecha.obtenerDatos(mensaje);
    }
}
