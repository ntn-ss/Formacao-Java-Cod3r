package controle;

public class ContinueRotulado {
    public static void main(String[] args) {
        // rótulo
        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    // sem rótulo, age no laço interno, não no externo
                    // continue;
                    continue externo;
                }
                System.out.printf("[%d %d]\n", i , j);
            }
        }
        System.out.println("Fim.");
    }
}