package itsj.actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText entrada, salida;
    Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adaptador = ArrayAdapter.createFromResource(this, R.array.temperaturas, android.R.layout.simple_spinner_item);

        entrada = findViewById(R.id.entrada);
        salida = findViewById(R.id.salida);

        spinner1 = findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(this);
        spinner1.setAdapter(adaptador);
        spinner2 = findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(this);
        spinner2.setAdapter(adaptador);

    }

}
