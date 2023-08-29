package br.com.screenmatch.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class FilmeDTO {

    private String nomeDoFilme;
    private Integer duracao;
    private Integer ano;
    private String genero;
}
