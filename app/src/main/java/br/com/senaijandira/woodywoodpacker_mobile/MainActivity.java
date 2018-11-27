package br.com.senaijandira.woodywoodpacker_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.senaijandira.woodywoodpacker_mobile.presenter.UsuarioPresenter;

public class MainActivity extends AppCompatActivity  {



    //EditText txtUsua;
    //EditText txtSenha;

    UsuarioPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // txtUsua.findViewById(R.id.txtUsuario);
        //txtSenha.findViewById(R.id.txtSenha);

        //presenter = new UsuarioPresenter(this, ServiceFactory.create());
        //presenter.confirmarUsuario("'nick'","123");

    }



    public void logar(View view) {

       // if(usuario.getUsuario().equals("usuario não existente")){


        //}else{
            startActivity(new Intent(this, InicioActivity.class));
        //}



    }
}


