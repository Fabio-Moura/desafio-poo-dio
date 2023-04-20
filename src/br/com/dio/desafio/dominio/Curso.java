package br.com.dio.desafio.dominio;

public class Curso extends conteudo{

   private Integer cargaHoraria;
   @Override
   public double calcularXp() {
      return XP_PADRAO * cargaHoraria;
   }

   public Curso() {
   }

    public Integer getCargaHoraria() {
      return cargaHoraria;
   }

   @Override
   public String toString() {
      return "Curso{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", cargaHoraria=" + cargaHoraria +
              '}';
   }

   public void setCargaHoraria(Integer cargaHoraria) {
      this.cargaHoraria = cargaHoraria;

   }


}
