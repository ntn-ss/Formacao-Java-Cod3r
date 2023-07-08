package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        // isto é incomum e extremamente bizarro, mas a possiblidade existe.
        int a = 97;
        int b = 'a'; //valores numéricos são associados a letras

        System.out.println(a==b);

        System.out.println('\u0061'); //isto imprime "a" no console porque 0X61 é o número 97 convertido para hexadecimal.

        System.out.println(3>4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30.1 >= 30.2);
        System.out.println(1 != 2);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.printf("Tem desconto? %s.\n", temDesconto);
    }
}