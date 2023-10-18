package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4355.89);
        
        var p2 = new Produto("Caneta", 12.56);
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1+precoFinal2)/2;

        System.out.printf("Preço final do produto 1: R$ %.2f.\n", precoFinal1);
        System.out.printf("Preço final do produto 2: R$ %.2f.\n", precoFinal2);
        System.out.printf("Média do carrinho: R$ %.2f.\n",mediaCarrinho);
    }
}