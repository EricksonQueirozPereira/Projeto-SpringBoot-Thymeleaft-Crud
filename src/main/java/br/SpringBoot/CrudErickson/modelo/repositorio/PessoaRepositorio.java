package br.SpringBoot.CrudErickson.modelo.repositorio;

import br.SpringBoot.CrudErickson.modelo.entidade.Pessoa;
import org.apache.juli.logging.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long> {
}
