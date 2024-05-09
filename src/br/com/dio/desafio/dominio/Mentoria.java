package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@ToString

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

}
