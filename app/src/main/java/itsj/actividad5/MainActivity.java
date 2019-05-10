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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        double grado = Double.parseDouble(entrada.getText().toString());
        double res;

        if(spinner1.getSelectedItem().toString().equals("Centigrados") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            res = celsiusToFahrenheit(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Centigrados") && spinner2.getSelectedItem().toString().equals("Kelvin")) {
            res = celsiusToKelvin(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Centigrados") && spinner2.getSelectedItem().toString().equals("Rankine")) {
            res = celsiusToRankine(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Centigrados")) {
            res = fahrenheitToCelsius(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Kelvin")) {
            res = fahrenheitToKelvin(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Rankine")) {
            res = fahrenheitToRankine(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Kelvin") && spinner2.getSelectedItem().toString().equals("Centigrados")) {
            res = kelvinToCelsius(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Kelvin") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            res = kelvinToFahrenheit(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Kelvin") && spinner2.getSelectedItem().toString().equals("Rankine")) {
            res = kelvinToRankine(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Rankine") && spinner2.getSelectedItem().toString().equals("Centigrados")) {
            res = rankineToCelsius(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Rankine") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            res = rankineToFahrenheit(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Rankine") && spinner2.getSelectedItem().toString().equals("Kelvin")) {
            res = rankineToKelvin(grado);
            salida.setText(res+"");
        } else if(spinner1.getSelectedItem().toString().equals("Centigrados") && spinner2.getSelectedItem().toString().equals("Centigrados")) {
            salida.setText(grado+"");
        } else if(spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            salida.setText(grado+"");
        } else if(spinner1.getSelectedItem().toString().equals("Kelvin") && spinner2.getSelectedItem().toString().equals("Kelvin")) {
            salida.setText(grado+"");
        } else if(spinner1.getSelectedItem().toString().equals("Rankine") && spinner2.getSelectedItem().toString().equals("Rankine")) {
            salida.setText(grado+"");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
    public double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    public double celsiusToRankine(double celsius) {
        double rankine = (celsius * 1.8) + 491.67;
        return rankine;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
    public double fahrenheitToKelvin(double fahrenheit) {
        double kelvin = ( (fahrenheit - 32) / 1.8 ) + 273.15;
        return kelvin;
    }
    public double fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit + 459.67;
        return rankine;
    }
    public double kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }
    public double kelvinToFahrenheit(double kelvin) {
        double fahrenheit = ( (kelvin - 273.15) * 1.8 ) + 32;
        return fahrenheit;
    }
}
