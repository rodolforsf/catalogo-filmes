package br.com.rr.catalogofilmes.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do br.com.rr.catalogofilmes.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filmes em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota)  {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
