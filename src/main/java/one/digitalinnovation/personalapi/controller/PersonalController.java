//Aqui devem ser criados os endpoints da aplicação.
//Antes, deve ser informado a anotação @RestController, pra indicar que essa classe contem
//as instruçoes necessárias, como a configuração dos endpoints por exemplo. Depois deve ser
//criado um objeto da classe de serviços para que se possam usar os métodos dessa classe
//esses endpoints são configurados de forma que ao serem acessados pela aplicação, eles acessem a classe
//de serviços, onde tem as regras de negócio.Não esquecendo de criar o construtor tambem.

package one.digitalinnovation.personalapi.controller;

import one.digitalinnovation.personalapi.model.Pessoa;
import one.digitalinnovation.personalapi.services.PessoaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoa")

public class PersonalController {

    private  PessoaServices pessoaServices;

    @Autowired
    public PersonalController(PessoaServices pessoaServices) {
        this.pessoaServices = pessoaServices;
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoaServices.SavePessoa(pessoa);
    }

    @GetMapping
    public List <Pessoa> ListaPessoa(){
        return pessoaServices.listaPessoa();
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> UmaPessoa (@PathVariable Long id){
        return pessoaServices.UmaPessoa(id);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        pessoaServices.DelPessoa(id);
    }

}
