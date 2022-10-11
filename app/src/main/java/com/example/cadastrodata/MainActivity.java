package com.example.cadastrodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnInserir,btnAlterar,btnDeletar,btnProcurar;
    EditText txtNumer,txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtNome= findViewById(R.id.editEmpName);
        this.txtNumer=findViewById(R.id.editEmpNo);

        this.btnInserir=findViewById(R.id.btInsert);
        this.btnAlterar=findViewById(R.id.btUpdate);
        this.btnDeletar=findViewById(R.id.btDelete);
        this.btnProcurar=findViewById(R.id.btSearch);

    }
    void Clear(){
        txtNumer.setText("");
        txtNome.setText("");

    }
}