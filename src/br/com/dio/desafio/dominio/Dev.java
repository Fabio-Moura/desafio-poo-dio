package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<conteudo> conteudosInscitos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscitos.addAll(bootcamp.getConteudos());
    }
    public void progredir() {
        Optional<conteudo> conteudo = this.conteudosInscitos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscitos.remove(conteudo.get());
        }else {
            System.err.println("Voce não esta matriculado em nenhum conteudo!");
        }
    }
    public void calcularXp() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscitos() {
        return conteudosInscitos;
    }

    public void setConteudosInscitos(Set<conteudo> conteudosInscitos) {
        this.conteudosInscitos = conteudosInscitos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscitos, dev.conteudosInscitos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscitos, conteudosConcluidos);
    }

    public String getConteudosInscritos() {
    }

    public double calcularTotalXp() {
        this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();

        return 0;
    }
}
