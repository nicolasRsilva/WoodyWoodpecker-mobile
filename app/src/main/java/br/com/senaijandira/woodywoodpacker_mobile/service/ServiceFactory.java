package br.com.senaijandira.woodywoodpacker_mobile.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {

    public static LivrariaService create(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LivrariaService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(LivrariaService.class);
    }

}
