package br.com.dio.desafio.dominio;

import lombok.*;

@Getter
@Setter
@ToString

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

}
