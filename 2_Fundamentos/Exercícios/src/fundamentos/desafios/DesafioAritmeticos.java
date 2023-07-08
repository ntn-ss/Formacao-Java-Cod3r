package fundamentos.desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double primeiraParte = Math.pow(6*(3+2), 2)/(3*2);
        double segundaParte = Math.pow((1-5) * (2-7)/2, 2);

        System.out.println(primeiraParte);
        System.out.println(segundaParte);
        
        double resultado = Math.pow(primeiraParte - segundaParte, 3) / Math.pow(10, 3);

        System.out.println(resultado);
    }
}
