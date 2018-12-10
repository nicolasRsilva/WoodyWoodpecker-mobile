package br.com.senaijandira.woodywoodpacker_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.senaijandira.woodywoodpacker_mobile.view.UsuarioView;

public class MainActivity extends AppCompatActivity  implements UsuarioView{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void autenticar(View v){
        startActivity(new Intent(this, InicioActivity.class));
    }



}


