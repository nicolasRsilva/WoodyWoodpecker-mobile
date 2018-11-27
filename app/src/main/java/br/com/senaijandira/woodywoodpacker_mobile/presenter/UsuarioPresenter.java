package br.com.senaijandira.woodywoodpacker_mobile.presenter;

import br.com.senaijandira.woodywoodpacker_mobile.model.Usuario;
import br.com.senaijandira.woodywoodpacker_mobile.service.LivrariaService;
import br.com.senaijandira.woodywoodpacker_mobile.view.UsuarioView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsuarioPresenter {

    UsuarioView view;
    LivrariaService service;

    public UsuarioPresenter(UsuarioView view, LivrariaService service){
        this.view = view;
        this.service = service;
    }

    public void confirmarUsuario(String usuario,String senha){
        service.loginAluno(usuario,senha).enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                 view.logar(response.body());
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {

            }
        });
    }


}
