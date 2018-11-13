package br.com.senaijandira.woodywoodpacker_mobile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.senaijandira.woodywoodpacker_mobile.fragment.Fragment1;
import br.com.senaijandira.woodywoodpacker_mobile.fragment.Fragment2;
import br.com.senaijandira.woodywoodpacker_mobile.fragment.Fragment3;

public class InicioActivity extends AppCompatActivity {

    FragmentManager fm;
    TabLayout tab_menu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //instanciando o frag,ent manager
        fm = getSupportFragmentManager();

        tab_menu = findViewById(R.id.tab_menu);

        //ação apos selecao da fragment
        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    openFragment1(null);
                }
                if(tab.getPosition() == 1){
                    openFragment2(null);
                }
                if(tab.getPosition() == 2){
                    openFragment3(null);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    public void openFragment1(View view){

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment1());

        ft.commit();

    }

    public void openFragment2(View view){

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment2());

        ft.commit();

    }

    public void openFragment3(View view){

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment3());

        ft.commit();

    }

}
