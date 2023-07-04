package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        // é possível usar underlines para facilitar a leitura.
        int id = 56_789;
        // Variáveis long de valor maior que o alcance do tipo int devem receber um L minúsculo ou maiúsculo na frente.
        long pontosAcumulados = 3_234_845_223L;

        // tipos numéricos reais

        // Variáveis float de valor contido no alcance do tipo double devem receber um F minúsculo ou maiúsculo na frente.
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false;

        // tipo caractere
        char status = 'A'; //ativo

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // número de viagens
        System.out.println(numeroDeVoos/2);

        // pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id+": ganha -> "+salario);
        System.out.println("Férias? "+estaDeFerias);
        System.out.println("Status: "+status);
    }
}
