package br.com.viviane.crud;

import br.com.viviane.crud.rh.dominio.Pessoa;
import br.com.viviane.crud.rh.dominio.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... args) throws Exception {

        Pessoa p1 = new Pessoa("Joao");
        p1.setDataNasc(LocalDate.of(1990, 4, 1));
        p1.setEmail("joao@gmail.com");

        Pessoa p2 = new Pessoa("Maria");
        p2.setDataNasc(LocalDate.of(1991, 1, 1));
        p2.setEmail("maria@gmail.com");

        pessoaRepository.save(p1);
        pessoaRepository.save(p2);
    }
}
