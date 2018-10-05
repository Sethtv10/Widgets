package com.widgetsmain.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner  bloodSpinner = (Spinner) findViewById(R.id.blood_spinner);
        ArrayAdapter<CharSequence> bloodTypeArray = ArrayAdapter.createFromResource( this, R.array.blood_type, android.R.layout.simple_spinner_item);
        bloodTypeArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bloodSpinner.setAdapter(bloodTypeArray);

        Button enviar = (Button) findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Gracias por Enviarnos tus datos", Toast.LENGTH_LONG).show();
            }
        });
    }
}
