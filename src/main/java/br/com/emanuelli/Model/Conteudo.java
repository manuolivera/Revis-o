package br.com.emanuelli.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "conteudo")
public class Conteudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 80)
    @NotNull
    private String nome;

    @Size(max = 100)
    @NotNull
    private String descricao;

    @NotNull
    private java.util.Date date;

    @OneToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", date=" + date +
                ", aluno=" + aluno.getNome();

    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;


    }
}

