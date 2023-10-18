package classe;

public class PrimeiroTrauma {
    int a = 3;

    // um método estático apenas chama um atributo ou método de instância... se tiver uma instância
    public static void main(String[] args) {
        PrimeiroTrauma PT = new PrimeiroTrauma();
        System.out.println(PT.a);
    }
}
