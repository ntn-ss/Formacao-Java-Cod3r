package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        // o professor pediu para fazer tudo com if, mas eu quis me desafiar e percorrer um vetor. Mal de já saber um pouco mais.

        String[] diasDaSemana = new String[] { "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado" };
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o dia da semana (sem acentos ou caracteres especiais).");
        String dia = entrada.next();
        
        boolean achouDia = false;

        for (int i = 0; i<diasDaSemana.length;i++){
            if (dia.equalsIgnoreCase(diasDaSemana[i])) {
                System.out.printf("Esse é o dia de número %d.%n", i+1);
                achouDia = true;
                break;
            }
        }

        if (!achouDia)
            System.out.println("Dia inválido.");
        
        System.out.println("Fim.");
        entrada.close();
    }
}