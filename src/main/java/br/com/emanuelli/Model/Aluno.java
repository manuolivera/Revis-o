package br.com.emanuelli.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity (name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 80)
    @NotNull
    private String nome;

    @Size (max = 40)
    @NotNull
    private String turma;

    @NotNull
    private int ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", ano=" + ano +
                '}';
    }
}
