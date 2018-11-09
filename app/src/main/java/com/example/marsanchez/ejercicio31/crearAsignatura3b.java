package com.example.marsanchez.ejercicio31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class crearAsignatura3b extends AppCompatActivity implements View.OnClickListener {

    EditText etNombreAsignatura, ethoras;
    Button btnCrear;
    private MyDBAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_asignatura3b);
        etNombreAsignatura = (EditText) findViewById(R.id.etNombreAsignatura);
        ethoras = (EditText) findViewById(R.id.ethoras);
        btnCrear = (Button) findViewById(R.id.btnCrearAsignatura);
        btnCrear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnCrearAsignatura:
                insertarAsignatura();
                break;
        }
    }

    public void insertarAsignatura() {
        String nombreAsignatura = etNombreAsignatura.getText().toString();
        String horas = ethoras.getText().toString();

        if (
                (nombreAsignatura.compareTo("") != 0) &&
                        (horas.compareTo("")!= 0)) {


            dbAdapter = new MyDBAdapter(getApplicationContext());
            dbAdapter.open();
            dbAdapter.insertarAsignaturaDBADAPTER(
                    etNombreAsignatura,
                    ethoras
                    );

            Toast creado = Toast.makeText(getApplicationContext(), "Asignatura creada con exito", Toast.LENGTH_SHORT);
            creado.show();

        } else {

            Toast noCreado = Toast.makeText(getApplicationContext(), "Asignatura no creada , revisa los campos", Toast.LENGTH_SHORT);
            noCreado.show();

        }
    }

}