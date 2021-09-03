package br.com.emanuelli.Service;

import br.com.emanuelli.Model.Conteudo;
import br.com.emanuelli.Repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConteudoServiceImpl implements ConteudoService{

    @Autowired
    ConteudoRepository conteudoRepository;

    @Override
    public List<Conteudo> findAll() {
        return conteudoRepository.findAll();
    }

    public boolean save(Conteudo conteudo) {
        try {
            conteudoRepository.save(conteudo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Conteudo findById(Long id) {
        return conteudoRepository.findById(id).get();
    }


    public boolean deleteById(Long id){
        try{
            conteudoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
