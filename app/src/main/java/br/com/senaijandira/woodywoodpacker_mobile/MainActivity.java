package br.com.senaijandira.woodywoodpacker_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.senaijandira.woodywoodpacker_mobile.model.Usuario;
import br.com.senaijandira.woodywoodpacker_mobile.presenter.UsuarioPresenter;
import br.com.senaijandira.woodywoodpacker_mobile.service.ServiceFactory;
import br.com.senaijandira.woodywoodpacker_mobile.view.UsuarioView;

public class MainActivity extends AppCompatActivity  implements UsuarioView{

    EditText txtUsuario;
    EditText txtSenha;
    String u;
    String s;
    String usu;
    String senhaa;

    UsuarioPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtSenha = findViewById(R.id.txtSenha);


        presenter = new UsuarioPresenter(this, ServiceFactory.create());


    }
    public void autenticar(View v){
        u = txtUsuario.toString();
        s = txtSenha.toString();
        presenter.confirmarUsuario(u,s);

    }

    public void Logar(Usuario usuario){

        usu = usuario.getUsuario();
        senhaa = usuario.getSenha();

       if(usu != "nick"){
            startActivity(new Intent(this, InicioActivity.class));
        }else{
            Toast.makeText(this, usu,Toast.LENGTH_LONG).show();
        }
    }




}


