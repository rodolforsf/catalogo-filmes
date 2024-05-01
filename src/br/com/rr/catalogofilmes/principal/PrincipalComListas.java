package br.com.rr.catalogofilmes.principal;

import br.com.rr.catalogofilmes.modelos.Filme;
import br.com.rr.catalogofilmes.modelos.Serie;
import br.com.rr.catalogofilmes.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Velozes e Furiosos",2001);
        filmeUm.avalia(9);
        Filme filmeDois = new Filme("O Exterminador do Futuro", 1984);
        filmeDois.avalia(8);
        var filmeTres = new Filme("À Espera de um Milagre", 1999);
        filmeTres.avalia(10);
        Serie serieUm = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new LinkedList<>();
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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Vin Diesel");
        buscaPorArtista.add("Arnold Schwarzenegger");
        buscaPorArtista.add("Paul Walker");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
    }
}
