import br.com.rr.catalogofilmes.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.nome = "Velozes e Furiosos";
        filmeUm.anoDeLancamento = 2001;
        filmeUm.duracaoEmMinutos = 106;

        filmeUm.exibirFichaTecnica();
        filmeUm.avalia(8);
        filmeUm.avalia(9);
        filmeUm.avalia(7);
        filmeUm.avalia(10);
        filmeUm.avalia(6);
        System.out.println("Total de avaliações: " + filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.retornaMedia());
    }
}
