package br.com.emanuelli.Service;

import br.com.emanuelli.Model.Aluno;
import br.com.emanuelli.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    public Aluno save(Aluno aluno){
        try {
            return alunoRepository.save(aluno);
        } catch (Exception e){
            System.out.println("Erro ao salvar o usuario." + e.getMessage());
            return null;
        }
    }

    public Aluno findById(Long id) {
        return alunoRepository.findById(id).get();
    }
    public void delete(Long id){
        alunoRepository.deleteById(id);

    }
}
