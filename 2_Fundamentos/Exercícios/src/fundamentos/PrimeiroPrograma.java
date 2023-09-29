package fundamentos;

/**
 * Esta classe representa... JAVADOC
 * @author Nathan
 * @since JDK1.0
 */

public class PrimeiroPrograma {
    public static void main(String[] args) {
        
        // comentários são pulados durante a compilação, têm como função ajudar o programador que vier depois de você, instruindo acerca do que cada parte do código de fato faz.
        
        // comentário simples com duas barras: uma sentença de código termina com ponto e vírgula.
        
        /*
            * comentário de várias linhas, barra e asterisco, fechado com asterisco e barra. A IDE cria asteriscos a cada linha pulada,
            *
            mas é desnecessário.
        */

        String saudacao = "Primeiro programa em Java após o ensino médio.";
        System.out.println(saudacao); //comentário após ponto e vírgula, embora seja mais adequado ele vir acima da linha em questão.
    }
}

// perceba que o código ficou muito poluído graças a tantos comentários desnecessários. Isso é uma má-prática, comentários devem vir apenas quando necessário, suprimindo inferências óbvias, sobretudo quando métodos e variáveis têm nomes autoexplicativos.