import br.com.rr.catalogofilmes.calculos.CalculadoraDeTempo;
import br.com.rr.catalogofilmes.modelos.Filme;
import br.com.rr.catalogofilmes.modelos.Serie;

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


    }
}
