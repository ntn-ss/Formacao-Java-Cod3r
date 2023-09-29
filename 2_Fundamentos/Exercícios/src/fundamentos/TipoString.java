package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // chatAt retorna o caractere em determinada posição da String com base em um índice passado como parâmetro.
        System.out.println("Olá, pessoal.".charAt(0));

        String s = "Boa tarde";
        // concat acopla uma String à frente da em questão. O + possui o mesmo efeito.
        System.out.println(s.concat("."));
        System.out.println(s + ".");

        // startsWith verifica se uma String passada como parâmetro é equivalente ao início da em questão. Diferencia entre maiúsculas e minúsculas.
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        
        // length retorna um inteiro referente ao tamanho, em caracteres, da String em questão.
        System.out.println(s.length());

        // startsWith verifica se uma String passada como parâmetro é equivalente à desinência da em questão. Diferencia entre maiúsculas e minúsculas.
        System.out.println(s.endsWith("tarde!"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));

        // equals verifica se uma String passada como parâmetro é idêntica à em questão. Diferencia entre maiúsculas e minúsculas, salvo o equalsIgnoreCase.
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        System.out.println(s.equals("Boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        // veja este crime.
        System.out.println("Nome: " + nome + "\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario+"\n\n");

        // fugindo dele: %s substitui valores de String, %d substitui valores inteiros e %f substitui valores flutuantes, com a possibilidade de um .2 antes para limitá-lo a duas casas decimais.
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario);

        // alternativa
        String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario);

        System.out.println(frase);

        // mais métodos
        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        // o índice passado como fim da substring não é incluso nela.
        System.out.println("Frase qualquer".substring(6, 10));
    }
}