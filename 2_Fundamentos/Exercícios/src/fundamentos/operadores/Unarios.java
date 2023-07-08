package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Valem para valores byte, short, int, long, float e double.
        a++; //a = a + 1
        a--; //a = a - 1

        ++b; //a = a + 1
        --b; //b = b - 1

        System.out.println(a);
        System.out.println(b);
        
        // Precedência: quando se coloca o operador unário antes do operando, significa que há pressa para o incremento e que ele deve ocorrer antes da comparação, e quando se coloca o -- após o operando, significa que a comparação vem antes do decremento.
        System.out.println("Minidesafio:");
        System.out.println(++a == b--);

        System.out.println(a);
        System.out.println(b);
    }
}
