package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        // conversão implícitva
        double a = 1;
        System.out.println(a);

        // as notações abaixo referem-se à conversão explícita (CAST), na qual o programador está ciente de que pode haver perda de informação.
        float b = 1F;
        b = (float)1.123456788888;
        System.out.println(b);

        int c = 128;
        byte d = (byte)c;
        
        System.out.println(d); //retorna -128 pois ele passou uma unidade do 127, o máximo do byte, e avançou uma unidade no começo desse conjunto, o -128.

        double e = 1.9999999;
        int f = (int)e;

        System.out.println(f); //retorna a parte inteira do número, sem tentar arredondá-lo.
    }
}