package one.digitalinnovation.personalapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personalapi.enums.TipoFone;

import javax.persistence.*;


//graças a classe lombok é possivel minimizar a verbosidade do código pois cada anotação abaixo tem
//finalidades especificas como descritas ao lado

//a anotação @Entity quer dizer essa classe será uma tabela do Banco de Dados
// e que os dados recebidos nas variaveis dessa classe serão os registros ou linha dessa tabela

@Entity
@Builder                       //referente a padrões de construção de objetos
@Data                          //anotação referente aos getters e setters que são incluidos automaticamente
@AllArgsConstructor            //anotações referentes ao construtor
@NoArgsConstructor




//Por ser um campo de uma tabela do BD é necessário informar qual a chave primaria será a
//referencia . O id por qual o registro será encontrado. Pra isso é usado a anotação @Id
public class Fones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoFone tipo;           //a variavel tipo é um objeto da classe TipoFone que por sua vez
                                     //contem enums ou tipos de objetos que são esperados. Essa classe
                                     //faz parte do pacote enums que por sua vez faz parte do pacote principal

    @Column(nullable = false)        //o @Column especifica que o atributo vai ser uma coluna da tabela e
    private String number;           //o praâmetro passado é uma constraint no BD que é uma regra que deve ser
                                     //seguida. Nesse caso esse campo não pode ser nulo
}
