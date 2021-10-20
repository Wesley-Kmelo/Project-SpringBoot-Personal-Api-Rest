//essa interface será responsavel por implementar outra interface, que tem entre seus métodos
//as funções de CRUD. Através do Generics é passado o parametro que informa qual classe será
//implementada com os métodos, ou seja, qual classe vai receber os métodos de CRUD por exemplo.
//Dessa forma é possivel criar um pacote services, e nesse pacote criar uma classe
// cuja função será abstrair apenas os métodos
//necessários ao código facilitando assim a manutenção do código.

package one.digitalinnovation.personalapi.repository;

import one.digitalinnovation.personalapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Long>{
}
