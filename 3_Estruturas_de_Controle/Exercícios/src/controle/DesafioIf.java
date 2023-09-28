package controle;

public class DesafioIf {
    public static void main(String[] args) {
        double nota = 1.3;

        // o fato de ter um ponto e vírgula errado executa o bloco de código, mesmo com a condição do if não sendo satisfeita.
        if (nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!");
        }
    }
}