package br.com.senaijandira.woodywoodpacker_mobile.service;

import java.util.List;

import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LivrariaService {
    String URL_BASE = "http://10.0.2.2:5002/";

    @GET("/autores")
    Call<List<Autores>> obterAutores();


}
