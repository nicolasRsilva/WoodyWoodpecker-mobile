package br.com.senaijandira.woodywoodpacker_mobile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import br.com.senaijandira.woodywoodpacker_mobile.Adapter.Adapter;
import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;
import br.com.senaijandira.woodywoodpacker_mobile.presenter.AutoresPresent;
import br.com.senaijandira.woodywoodpacker_mobile.service.ServiceFactory;
import br.com.senaijandira.woodywoodpacker_mobile.view.MainView;

public class InicioActivity extends AppCompatActivity implements MainView, AdapterView.OnItemClickListener {

    ListView listView;
    Adapter adapter;

    FragmentManager fm;
    TabLayout tab_menu;

    AutoresPresent presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        listView = findViewById(R.id.listViewAutores);
        adapter = new Adapter(this);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


        presenter = new AutoresPresent(this, ServiceFactory.create());
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.carregarAutores();
    }

    public void preencherLista (List<Autores>lstAutores){

        adapter.clear();
        adapter.addAll(lstAutores);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Autores autorSelecionado = adapter.getItem(position);


    }
}
