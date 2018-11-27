package br.com.senaijandira.woodywoodpacker_mobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import br.com.senaijandira.woodywoodpacker_mobile.R;
import br.com.senaijandira.woodywoodpacker_mobile.model.Autores;

public class Adapter extends ArrayAdapter<Autores> {


    public Adapter(Context ctx){
        super(ctx, 0, new ArrayList<Autores>());
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;

        if(v == null){

            v = LayoutInflater.from(getContext()).inflate(R.layout.layout_autores,parent,false);
        }

        Autores autor = getItem(position);
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
