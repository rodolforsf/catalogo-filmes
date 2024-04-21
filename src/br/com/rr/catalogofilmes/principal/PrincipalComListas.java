package br.com.rr.catalogofilmes.principal;

import br.com.rr.catalogofilmes.modelos.Filme;
import br.com.rr.catalogofilmes.modelos.Serie;
import br.com.rr.catalogofilmes.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Velozes e Furiosos",2001);
        filmeUm.avalia(9);
        Filme filmeDois = new Filme("O Exterminador do Futuro", 1984);
        filmeDois.avalia(8);
        var filmeTres = new Filme("À Espera de um Milagre", 1999);
        filmeTres.avalia(10);
        Serie serieUm = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeTres);
        lista.add(filmeUm);
        lista.add(filmeDois);
        lista.add(serieUm);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Clasificação " + filme.getClassificacao());
            }
            }

    }
}
