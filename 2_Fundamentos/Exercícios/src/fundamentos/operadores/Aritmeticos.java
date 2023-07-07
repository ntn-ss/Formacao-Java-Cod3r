package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3+"\n");
        
        var x = 34.56;
        double y = 2.2;
        
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y+"\n");
        
        int a = 8;
        int b = 3;
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        
        // operações aritméticas entre números inteiros resultam em inteiros. Para mostrar casas decimais, conversão para double ou float (embora o float tenha precisão menor nas casas decimais).
        System.out.println(a / (double)b);
        // System.out.println(a / (float)b);

        // operador módulo (ou mod): retorna o resto de uma divisão.
        System.out.println(a % b+"\n");

        // como esperado, a multiplicação e a divisão recebem maior prioridade que as duas outras operações básicas.
        System.out.println(x+y - a*b);

        // extra: potenciação. O método Math.pow retorna um double.
        int termoElevado = 3 * 4 - 10;
        int resultadoPotencia = (int)Math.pow(termoElevado, 3);

        System.out.println(resultadoPotencia);
    }    
}
