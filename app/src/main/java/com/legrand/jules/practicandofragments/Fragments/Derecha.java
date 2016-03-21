package com.legrand.jules.practicandofragments.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.legrand.jules.practicandofragments.R;

/**
 * Created by Jules on 22/02/2016.
 */
public class Derecha extends Fragment {

    View rootView;
    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.derecha, container, false);
        txt = (TextView)rootView.findViewById(R.id.txt);
        return rootView;
    }

    public void obtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
