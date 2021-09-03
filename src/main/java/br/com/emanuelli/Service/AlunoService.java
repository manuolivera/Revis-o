package br.com.emanuelli.Service;

import br.com.emanuelli.Model.Aluno;

import java.util.List;

public interface AlunoService {

    public Aluno findById(Long id);
    public List<Aluno> findAll();
    public Aluno save(Aluno aluno);
    public void delete(Long id);
}