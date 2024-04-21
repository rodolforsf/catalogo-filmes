import br.com.rr.catalogofilmes.calculos.CalculadoraDeTempo;
import br.com.rr.catalogofilmes.calculos.FiltroRecomendacao;
import br.com.rr.catalogofilmes.modelos.Episodio;
import br.com.rr.catalogofilmes.modelos.Filme;
import br.com.rr.catalogofilmes.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.setNome("Velozes e Furiosos");
        filmeUm.setAnoDeLancamento(2001);
        filmeUm.setDuracaoEmMinutos(106);

        filmeUm.exibirFichaTecnica();
        filmeUm.avalia(8);
        filmeUm.avalia(9);
        filmeUm.avalia(7);
        filmeUm.avalia(10);
        filmeUm.avalia(6);
        System.out.println("Total de avaliações: " + filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.retornaMedia());

        Serie serieUm = new Serie();
        serieUm.setNome("La Casa de Papel");
        serieUm.setAnoDeLancamento(2017);
        serieUm.exibirFichaTecnica();
        serieUm.setTemporadas(5);
        serieUm.setEpisodiosPorTemporada(8);
        serieUm.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie em minutos: " + serieUm.getDuracaoEmMinutos());

        Filme filmeDois = new Filme();
        filmeDois.setNome("O Exterminador do Futuro");
        filmeDois.setAnoDeLancamento(1984);
        filmeDois.setDuracaoEmMinutos(107);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeUm);
        calculadora.inclui(filmeDois);
        calculadora.inclui(serieUm);
        System.out.println("Calculadora " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeUm);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieUm);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeTres = new Filme("À Espera de um Milagre");
        //filmeTres.setNome("À Espera de um Milagre");
        filmeTres.setAnoDeLancamento(1999);
        filmeTres.setDuracaoEmMinutos(189);
        filmeTres.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeTres);
        listaDeFilmes.add(filmeUm);
        listaDeFilmes.add(filmeDois);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());

        Object objeto = filmeTres;

    }
}
