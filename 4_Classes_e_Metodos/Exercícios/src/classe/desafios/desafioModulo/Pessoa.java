package desafioModulo;

import java.math.BigDecimal;

public class Pessoa {

    private String nome;
    private double peso;

    private static BigDecimal truncateDecimal(double x,int numberofDecimals) {
    if ( x > 0 ) {
        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
    } else {
        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
    }
}

    Pessoa(String nome, double peso) {
        this.setNome(nome);
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean comer(Comida comida) {
        if (comida != null) {
            double pesoAnterior = this.getPeso();
            this.setPeso(this.peso += comida.getPeso());
            String stringFormatada = String.format("A pessoa '%s', de peso anterior '%s', comeu '%s', que pesava '%s', e agora pesa '%s'.", this.getNome(), truncateDecimal(pesoAnterior, 2) + " kg", comida.getNome(), comida.getPeso() < 1 ? comida.getPeso() * 1000 + " g" : comida.getPeso() + " kg", ""+truncateDecimal(this.getPeso(), 2));
            System.out.println(stringFormatada);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Pessoa: '[nome: %s]', [peso: %.2f kg].", this.getNome(), this.getPeso());
    }
}