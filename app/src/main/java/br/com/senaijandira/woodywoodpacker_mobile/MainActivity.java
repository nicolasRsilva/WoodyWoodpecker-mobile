package br.com.senaijandira.woodywoodpacker_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    EditText txtLogin;
    EditText txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void logar(View view) {
        startActivity(new Intent(this, InicioActivity.class));
    }
}


