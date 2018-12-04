package br.com.senaijandira.woodywoodpacker_mobile.model;

import com.google.gson.annotations.SerializedName;

public class Autores {

    @SerializedName("nome")
    private String titulo;

    private String descricao;
    @SerializedName("idAutores")
    private int id;
    private boolean status;

    @SerializedName("imagem")
    private String fotoAutor;

    public Autores(){}


    public Autores(String fotoAutor, String titulo, String descricao, boolean status){
        this.fotoAutor=fotoAutor;
        this.titulo=titulo;
        this.descricao=descricao;
        this.status=status;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFotoAutor() {
        return fotoAutor;
    }

    public void setFotoAutor(String fotoAutor) {
        this.fotoAutor = fotoAutor;
    }
}
