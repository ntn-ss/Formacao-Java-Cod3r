package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Calcularei as médias de uma turma.");
        System.out.println("Receberei notas até você digitar '-1'.\n");
        
        int qtdAlunos = 0;
        double notaAtual = 0;
        double total = 0;

        while (notaAtual != -1) {
            System.out.print("Digite uma nota. ");
            notaAtual = ler.nextDouble();
            if (notaAtual != -1 && (notaAtual < 0 || notaAtual > 10)) {
                System.out.println("Digite uma nota válida.");
            }
            else if (notaAtual != -1) {
                System.out.printf("Entendi, %.2f será somado a %.2f.\n", notaAtual, total);
                total += notaAtual;
                qtdAlunos++;
            }
        }
        
        System.out.printf("Certo, a média da turma dessa turma de %d alunos é %.2f.\n", qtdAlunos, total/qtdAlunos);

        ler.close();
    }
}
