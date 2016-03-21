package com.legrand.jules.practicandofragments.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.legrand.jules.practicandofragments.EnviarMensaje;
import com.legrand.jules.practicandofragments.R;

/**
 * Created by Jules on 22/02/2016.
 */
public class Izquierda extends Fragment{

    View rootView;
    EditText campo;
    Button boton;
    EnviarMensaje EM;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.izquierda, container, false);
        campo = (EditText)rootView.findViewById(R.id.campotxt);
        boton = (Button)rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });
        return rootView;
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try {
            EM = (EnviarMensaje)activity;
        }catch (ClassCastException e){
            throw new ClassCastException("Necesitas implementar");
        }
    }
}
