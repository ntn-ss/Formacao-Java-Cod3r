package controle;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            if (i%2==1) {
                // um "quase break" que interrompe esta iteração, mas vai para a próxima
                continue;
            }

            // em uma linha também é válido, para pular a iteração com contador 6:
            if (i == 6) continue;

            System.out.println(i);
        }
    }
}
