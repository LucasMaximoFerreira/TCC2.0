package com.example.casadoacaitcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import utils.utilsCadastro_cliente;

public class Cadastro2 extends AppCompatActivity implements View.OnClickListener {

    EditText txtCPF, txtTelefone;
    Button btnCad2;
    RadioGroup rgGen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        txtCPF = findViewById(R.id.txtCPF);
        txtTelefone = findViewById(R.id.txtTelefone);
        btnCad2 = findViewById(R.id.btnCad2);
        rgGen = findViewById(R.id.rgGen);

        btnCad2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCad2:

                utilsCadastro_cliente.setCpf_cli(txtCPF.getText().toString());
                utilsCadastro_cliente.setTel_cli(txtTelefone.getText().toString());

                int opGen = rgGen.getCheckedRadioButtonId();
                switch (opGen) {
                    case R.id.rbMasculino:
                        utilsCadastro_cliente.setGen_cli("Masculino");
                        break;
                    case R.id.rbFeminino:
                        utilsCadastro_cliente.setGen_cli("Feminino");
                        break;
                    case R.id.rbPND:
                        utilsCadastro_cliente.setGen_cli("Prefiro não dizer");
                        break;
                }

                Intent telaCad3 = new Intent(this, Cadastro3.class);
                startActivity(telaCad3);
                break;
        }
    }
}