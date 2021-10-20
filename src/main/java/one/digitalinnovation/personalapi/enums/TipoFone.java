//pacote que contem os únicos tipos de fone que serão aceitos na classe responsavel por persistir os dados
//na tabela. Essa Classe  está relacionada no pacote model

package one.digitalinnovation.personalapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum TipoFone {
    CASA("Principal"),
    CELULAR("Tel Celular"),
    COMERCIAL("Tel Comercial");

    private  final String contato;
}
