package br.com.senaijandira.woodywoodpacker_mobile.Adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import br.com.senaijandira.woodywoodpacker_mobile.InicioActivity;
import br.com.senaijandira.woodywoodpacker_mobile.R;
import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;
import br.com.senaijandira.woodywoodpacker_mobile.presenter.AutoresPresent;

public class Adapter extends ArrayAdapter<Autores> {

    ImageView menu;
    AutoresPresent present;

    public Adapter(Context ctx){
        super(ctx, 0, new ArrayList<Autores>());
    }



    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;

        if(v == null){

            v = LayoutInflater.from(getContext()).inflate(R.layout.layout_autores,parent,false);
        }

        final Autores autor = getItem(position);
        TextView txtTitulo =  v.findViewById(R.id.txtTitulo);
        TextView txtDescricao =  v.findViewById(R.id.txtDescricao);
        ImageView fotoAutor = v.findViewById(R.id.fotoAutor);


        String urlFoto = getContext().getString(R.string.IMAGEM_URL) + autor.getFotoAutor();

        Glide.with(getContext()).load(urlFoto).into(fotoAutor);

        txtTitulo.setText(autor.getTitulo());
        txtDescricao.setText(autor.getDescricao());


        menu = v.findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPop(v, autor,position);
            }
        });

        return v;
    }

    public void deletarAutor(int id){
        InicioActivity inicio = new InicioActivity();
        inicio.excluir(id);

//        String a = String.valueOf(id);
//        alert("a",a);
    }



    //MENU
    public void menuPop(final View v, final Autores autor, final int position){
        final PopupMenu popupMenu = new PopupMenu(v.getContext(), v);

        popupMenu.getMenuInflater().inflate(R.menu.menu_autores, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.menuEditar){

                }
                if(item.getItemId() == R.id.menuExcluir){
                    deletarAutor(autor.getId());
                }


                return false;
            }
        });
        popupMenu.show();
    }


    public void alert(String titulo, String msg){

        AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setCancelable(false);
        alert.setPositiveButton("Próximo", new Dialog.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }

        });

        alert.create().show();

    }

}
