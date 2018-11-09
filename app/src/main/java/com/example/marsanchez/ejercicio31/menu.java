package com.example.marsanchez.ejercicio31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {
    Button btn3a, btnCrearAlumno, btnCrearProfesor,btnCrearAsignatura,btnToConsultas, btnToConsultasPreexamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn3a = (Button) findViewById(R.id.btn3a);
        btn3a.setOnClickListener(this);

        btnCrearAlumno = (Button) findViewById(R.id.btnCrearAlumno);
        btnCrearAlumno.setOnClickListener(this);

        btnCrearProfesor = (Button) findViewById(R.id.btnCrearProfesor);
        btnCrearProfesor.setOnClickListener(this);

        btnCrearAsignatura = (Button) findViewById(R.id.btnCrearAsignatura);
        btnCrearAsignatura.setOnClickListener(this);

        btnToConsultas = (Button) findViewById(R.id.btnToConsultas);
        btnToConsultas.setOnClickListener(this);

        btnToConsultasPreexamen = (Button) findViewById(R.id.btnToConsultasPreexamen);
        btnToConsultasPreexamen.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn3a:
                Intent a = new Intent(menu.this, guardarPreferencias3a.class);
                startActivity(a);
                break;

            case R.id.btnCrearAlumno:
                Intent b = new Intent(menu.this, crearAlumno3b.class);
                startActivity(b);
                break;
            case R.id.btnCrearProfesor:
                Intent c = new Intent(menu.this, crearProfesor3b.class);
                startActivity(c);
                break;
            case R.id.btnCrearAsignatura:
                Intent f = new Intent(menu.this, crearAsignatura3b.class);
                startActivity(f);
                break;
            case R.id.btnToConsultas:
                Intent d = new Intent(menu.this, consultasVarias3c.class);
                startActivity(d);
                break;

            case R.id.btnToConsultasPreexamen:
                Intent e = new Intent(menu.this, consultasPreexamen.class);
                startActivity(e);
                break;


        }
    }


}
