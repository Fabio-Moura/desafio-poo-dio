package br.com.dio.desafio.dominio;

import java.time.LocalDate;

@SuppressWarnings("unused")

public class Mentoria extends conteudo{
    private String titulo;
   private String descrcao;
   private LocalDate data;

   @Override
   public double calcularXp(){
       return XP_PADRAO + 20;
   }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrcao='" + descrcao + '\'' +
                ", data=" + data +
                '}';
    }

    }


