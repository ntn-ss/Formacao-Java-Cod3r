package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";

        // um switch que entra em um case sem break execusa os casos abaixo também
        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Faixa máxima: 7.");
            case "marrom":
                System.out.println("Faixa 6.");
            case "roxa":
                System.out.println("Faixa 5.");
            case "verde":
                System.out.println("Faixa 4.");
            case "laranja":
                System.out.println("Faixa 3.");
            case "amarela":
                System.out.println("Faixa 2.");
            default:
                System.out.println("Faixa mínima: 1.");
        }
        
        System.out.println("Fim.");

        int idade = 3;
        switch(idade) {
            case 3:
                System.out.println("Sabe programar em Java.");
            case 2:
                System.out.println("Sabe andar.");
            case 1:
                System.out.println("Sabe falar.");
            case 0:
                System.out.println("Sabe chorar.");
        }
        
        System.out.println("Fim.");
    }
}
