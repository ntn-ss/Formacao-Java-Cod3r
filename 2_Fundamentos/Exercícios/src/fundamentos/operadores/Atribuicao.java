package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b; //c = c + b
        System.out.println(c);
        
        c -= a; //c = c - a
        System.out.println(c);
        
        c *= b; //c = c * b
        System.out.println(c);
        
        c /= a; //c = c / a
        System.out.println(c);

        // Isto só retornará zero ou um: zero se par, um se ímpar. Saber se é par ou ímpar é o uso mais comum do resto de uma divisão.
        c %= 2; //c = c % 2
        
        System.out.println(c);
    }
}
