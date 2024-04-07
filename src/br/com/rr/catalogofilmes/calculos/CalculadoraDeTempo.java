package br.com.rr.catalogofilmes.calculos;
import br.com.rr.catalogofilmes.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
