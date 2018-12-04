package br.com.senaijandira.woodywoodpacker_mobile.view;

import java.util.List;

import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;

public interface MainView {
    void preencherLista (List<Autores>lstAutores);
     void deletar(String a);
}
