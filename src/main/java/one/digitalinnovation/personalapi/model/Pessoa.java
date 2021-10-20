package one.digitalinnovation.personalapi.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//cada anotação foi descrita na classe Fones

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

     @Column
     private String sobrenome;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate niver;

    //essa anotação serve para criar um relacionamento entre a tabela gerada por esta classe e a tabela de fones
    //a propriedade fetch especifica que esse relacionamento só será feito no momento que essa classe for
    //chamada. A propriedade CASCADE quer dizer que quando o registro dessa tabela sofrer uma alteração,
    //isso deve ser replicado na tabela relacionada.
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private List <Fones> fones = new ArrayList<>();

}
