package br.com.emanuelli.Repository;

import br.com.emanuelli.Model.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {
}