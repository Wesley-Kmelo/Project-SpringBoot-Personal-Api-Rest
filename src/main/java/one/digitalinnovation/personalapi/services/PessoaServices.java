//essa classe é reponsável por conter todas as regras de negócio da aplicação acessadas pela
//pacote controller.
//Antes de tudo essa classe deve receber a anotação de @service pra ser identificada como classe
//de serviços.
//Primeiro se cria um objeto da interface repository que já contem vários métodos, entre eles o
//CRUD e o HashCode. Depois se cria uma anotação que torna automática a incrementação do cadastro,
//e nessa anotação se cria um construtor passando um objeto da classe repository como parametro
//pra ser retornado. Só ai são criados os métodos que serão mapeados na classe controller.

package one.digitalinnovation.personalapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personalapi.model.Pessoa;
import one.digitalinnovation.personalapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PessoaServices {

    @Autowired
    private PessoaRepository pessoaRepository;


//após importar a classe Pessoa é possivel criar um método do tipo objetoPessoa e que recebe como
//parametro um objeto desse mesmo tipo .Depois utilizando um dos métodos da interface repository
//se retorna o objeto necessário
    public Pessoa SavePessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public List <Pessoa> listaPessoa(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> UmaPessoa (Long id){
        return pessoaRepository.findById(id);
    }

    public void DelPessoa (Long id){
         pessoaRepository.findById(id);
         pessoaRepository.deleteById(id);
    }
}
