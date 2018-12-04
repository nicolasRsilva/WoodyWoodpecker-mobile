package br.com.senaijandira.woodywoodpacker_mobile.presenter;

import android.util.Log;

import java.util.List;

import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;
import br.com.senaijandira.woodywoodpacker_mobile.service.LivrariaService;
import br.com.senaijandira.woodywoodpacker_mobile.view.MainView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AutoresPresent {

    MainView mainView;
    Autores autores;
    LivrariaService service;

    public AutoresPresent (MainView mainView, LivrariaService service){
        this.mainView = mainView;
        this.service = service;
    }

    public void carregarAutores(){

        Call<List<Autores>> call = service.obterAutores();

        call.enqueue(new Callback<List<Autores>>() {
            @Override
            public void onResponse(Call<List<Autores>> call, Response<List<Autores>> response) {
                List<Autores> autores = response.body();

                for(Autores a: autores){
                    Log.d("API-WOOD", a.getTitulo());
                }

                mainView.preencherLista(autores);
            }

            @Override
            public void onFailure(Call<List<Autores>> call, Throwable t) {
                Log.e("ERRO_API", t.getMessage());
            }
        });
    }

    public void deletarAutores(int id){
        service.deletarAutores(id).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                mainView.deletar(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

}
