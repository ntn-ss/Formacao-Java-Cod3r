package fundamentos.operadores;

import javax.swing.JOptionPane;

public class Ternario {
    public static void main(String[] args) {
        double media = Double.parseDouble(JOptionPane.showInputDialog("Qual a média do aluno?"));

        // a interrogação separa a expressão dos possíveis valores da atribuição: o primeiro é para o caso verdadeiro, o segundo para o falso.
        String resultadoRecuperacao = media >= 4.0 ?
                "de recuperação" : "reprovado";
        
        String resultado = media >=7 ?
                "aprovado" : resultadoRecuperacao;

        System.out.printf("O aluno está %s.\n", resultado);

        // um bom uso para o operador ternário é transformar valores booleanos em variantes em português.
        boolean souFeio = false;
        String euSouFeio = souFeio ? "Sim" : "Não";

        System.out.printf("Eu sou feio? %s.\n", euSouFeio);
    }
}