public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.nome = "Velozes e Furiosos";
        filmeUm.anoDeLancamento = 2001;
        filmeUm.duracaoEmMinutos = 106;


        System.out.println(filmeUm.nome);
        System.out.println(filmeUm.anoDeLancamento);
    }
}
