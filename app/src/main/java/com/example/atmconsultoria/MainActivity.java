package com.example.atmconsultoria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private ImageButton btnEmpresa;
    private ImageButton btnServicos;
    private ImageButton btnContato;
    private ImageButton btnClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpresa = (ImageButton) findViewById(R.id.btnEmpresa);
        btnServicos = (ImageButton) findViewById(R.id.btnServicos);
        btnClientes = (ImageButton) findViewById(R.id.btnClientes);
        btnContato = (ImageButton) findViewById(R.id.btnContato);

        btnEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Empresa.class));
            }
        });

        btnServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Servicos.class));
            }
        });

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Clientes.class));
            }
        });

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Contato.class));
            }
        });

    }
}
