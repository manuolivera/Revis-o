package br.com.emanuelli.Service;


import br.com.emanuelli.Model.Conteudo;

import java.util.List;

public interface ConteudoService {
    List<Conteudo> findAll();
    public Conteudo findById(Long id);
    public boolean deleteById(Long id);
}