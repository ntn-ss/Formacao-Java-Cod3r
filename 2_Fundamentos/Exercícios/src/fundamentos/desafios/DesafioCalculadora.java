package fundamentos.desafios;

import java.util.Locale;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    
    // usei conhecimentos um pouco mais avançados do que o ensinado nas aulas do módulo.

    static double calcula(double numero1, double numero2, char sinal) {
        if (String.valueOf(sinal).equals("+")){
            return numero1 + numero2;
        } 
        
        else if (String.valueOf(sinal).equals("-")){
            return numero1 + numero2;
        }
        
        else if (String.valueOf(sinal).equals("*")){
            return numero1 * numero2;
        }
        
        else if (String.valueOf(sinal).equals("/")){
            return numero1 / numero2;
        }
        
        else if (String.valueOf(sinal).equals("%")){
            return numero1 % numero2;
        }

        // retorna zero em caso de sinal desconhecido
        else {
            return 0;
        }
    }

    public static void main(String[] args) {


        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Bem-vindo à Calculadora!\nInsira o primeiro número."));
        char sinal = JOptionPane.showInputDialog("Insira o sinal referente à operação.").charAt(0);
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número."));

        System.out.printf(Locale.US, "O primeiro número é %.1f, o segundo número é %.1f e o sinal é %s.\n", numero1, numero2, sinal);

        double resultado = 0;
        
        resultado = calcula(numero1, numero2, sinal);

        System.out.print("Resultado: ");
        System.out.printf(Locale.US, "%.2f.\n", resultado);
    }
}