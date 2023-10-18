package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // eu poderia criar um método de nome igual, mas parâmetros diferentes, e o Java ainda os distinguiria no momento de chamada em outra classe
    public double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}