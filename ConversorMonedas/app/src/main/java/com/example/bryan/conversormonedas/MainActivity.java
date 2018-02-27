package com.example.bryan.conversormonedas;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view) {
        System.out.println("BHS");
        EditText canti = findViewById(R.id.cantidad);
        RadioButton crcC = findViewById(R.id.aCRC);
        RadioButton usdC = findViewById(R.id.aUSD);
        TextView result = findViewById(R.id.txtResultado);

        if(canti.toString().isEmpty()==false){
            double resultado =  Double.parseDouble(canti.getText().toString());
            System.out.println(resultado);
            String Mensaje = "El resultado es: ";
            if (crcC.isChecked()){
                result.setText(Mensaje + Double.toString(resultado*572.54));
            }
            else if (usdC.isChecked()){
                result.setText(Mensaje + Double.toString(resultado/572.54));
            }
            else{
                result.setText("Por favor, seleccione una conversión.");
            }
        }
    }
}
