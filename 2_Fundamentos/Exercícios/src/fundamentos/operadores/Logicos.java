package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);
        System.out.println(condicao1 && !condicao2);
        
        // Também é possível negar uma negação:
        // System.out.println(!!condicao1);

        // comentei os códigos mortos para evitar advertências
        System.out.println("\nTabela verdade 'E' (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);
        
        System.out.println("\nTabela verdade 'OU' (OR)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println("\nTabela verdade 'OU EXCLUSIVO' (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        
        System.out.println("\nTabela verdade 'NEGAÇÃO' (NOT)");
        System.out.println(!true);
        System.out.println(!false);
    }
}