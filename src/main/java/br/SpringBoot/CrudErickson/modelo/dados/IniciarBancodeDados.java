package br.SpringBoot.CrudErickson.modelo.dados;


import br.SpringBoot.CrudErickson.modelo.entidade.Pessoa;
import br.SpringBoot.CrudErickson.modelo.repositorio.PessoaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class IniciarBancodeDados implements CommandLineRunner {

@Autowired
    private PessoaRepositorio pessoaRepo;

    @Override
    public void run(String... args) throws Exception {
        Pessoa p1 = new Pessoa("Erickson");
        p1.setDataNascimento(LocalDate.of(1994, 2, 19));
        p1.setEmail("ericksongustaovo2022@gmail.com");
        p1.setTelefone("(81)98713-3364");
        Pessoa p2 = new Pessoa("Maria");
        p2.setDataNascimento(LocalDate.of(2000, 1, 10));
        p2.setEmail("maria@gmail.com");
        p2.setTelefone("(81)98821-1128");


        pessoaRepo.save(p1);
        pessoaRepo.save(p2);
    }

}
