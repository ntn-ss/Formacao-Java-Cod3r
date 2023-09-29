package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira um valor em Fahrenheit.");
        double fahrenheit = ler.nextDouble();
        
        final int AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O valor em Celsius é " + celsius+" °C.");

        ler.close();
    }
}