package one.digitalinnovation.personalapi;

import one.digitalinnovation.personalapi.controller.PersonalController;
import one.digitalinnovation.personalapi.enums.TipoFone;
import one.digitalinnovation.personalapi.model.Fones;
import one.digitalinnovation.personalapi.model.Pessoa;
import one.digitalinnovation.personalapi.repository.PessoaRepository;
import one.digitalinnovation.personalapi.services.PessoaServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class PersonalapiApplicationTests {

	@Test
	void SalvarPessoa() {
		Pessoa pessoa = new Pessoa();
		List<Fones> lista = null;
		lista.add(Fones.builder()
						.id(Long.valueOf(1))
						.tipo(TipoFone.valueOf("CELULAR"))
						.number("33322212112")
						.build());

		pessoa.builder()
				.id(Long.valueOf(1))
				.nome("wesley")
				.cpf("90128374874")
				.sobrenome("silva")
				.fones(lista)
				.build();

		PessoaServices pessoaServices = new PessoaServices();

		pessoaServices.SavePessoa(pessoa);

		Assertions.assertEquals(true, pessoaServices.equals(true));

	}

}
