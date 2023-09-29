package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        // variáveis inicialmente declaradas reais (float ou double) conseguem receber valores inteiros, mas o contrário é impossível, pois o primeiro conjunto numérico é maior que o segundo.

        double a = 4.5;
        System.out.println(a);

        // não é necessário declarar o tipo explicitamente
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);
        
        c = "Outro texto";
        System.out.println(c);

        // variáveis não mudam de tipo.
        // c = 4.5; é erro

        // declarei, inicializei e usei a variável em três linhas diferentes.
        double d;
        d = 123.65;
        System.out.println(d);
    }
}