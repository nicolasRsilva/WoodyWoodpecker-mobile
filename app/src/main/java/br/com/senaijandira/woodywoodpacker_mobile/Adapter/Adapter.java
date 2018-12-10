package br.com.senaijandira.woodywoodpacker_mobile.Adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewParentCompat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import br.com.senaijandira.woodywoodpacker_mobile.InicioActivity;
import br.com.senaijandira.woodywoodpacker_mobile.R;
import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;
import br.com.senaijandira.woodywoodpacker_mobile.presenter.AutoresPresent;
import br.com.senaijandira.woodywoodpacker_mobile.service.LivrariaService;
import retrofit2.Call;

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

        return v;
    }





}
