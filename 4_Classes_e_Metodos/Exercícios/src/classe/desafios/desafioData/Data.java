package desafioData;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static int anoMinimo = 1970;
    private static int anoMaximo = 3000;
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (dia > 31 || dia <= 0) {
            throw new IllegalArgumentException("Dia inválido.");
        }
        else {
            this.dia = dia;
        }
    }

    public void setMes(int dia, int mes) {
        if (mes==2 && dia > 29) {
            throw new IllegalArgumentException(String.format("O mês 'fevereiro' não pode ter '%d' dias.\n", dia));
        }

        else if (mes==2 && dia == 29 && ano %4 != 0) {
            throw new IllegalArgumentException(String.format("O ano '%d' não é bissexto.\n", ano));
        }
        else if (mes > 12 || mes<=0) {
            throw new IllegalArgumentException("Mês inválido: deve estar entre 01 e 12.");
        }
        else {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (ano < anoMinimo || ano >= anoMaximo) {
            throw new IllegalArgumentException(String.format("Ano inválido: deve estar entre %d e %d.\n", anoMinimo, anoMaximo));
        }
        else {
            this.ano = ano;
        }
    }

    // construtor padrão, quando não forem passados argumentos no instanciamento
    Data() {
        // sempre que se chama this como método, um construtor está sendo chamado. Mas quem define o construtor a ser chamado é a quantidade de parâmetros e a ordem de suas tipagens (ou seja, a assinatura).
        this(1, 1, anoMinimo);
    }

    Data(int dia, int mes, int ano) {
        
        setDia(dia);

        setMes(dia, mes);
        
        setAno(ano);

    }

    public String toString() {
        String stringFormatada = String.format("%s/%s/%s", dia < 10 ? "0"+dia : "" + dia, mes < 10 ? "0"+mes : ""+mes, ano);
        return stringFormatada;
    }

}