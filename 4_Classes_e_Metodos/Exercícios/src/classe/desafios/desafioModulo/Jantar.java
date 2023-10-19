package desafioModulo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 69.5);
        System.out.println(p1.toString());
        
        Comida c1 = new Comida("Feijão", 0.5);
        Comida c2 = new Comida("Big Mac", 30);

        p1.comer(c1);
        p1.comer(c2);

        p1.setNome("João Gordo");

        // prova de alteração nos valores
        System.out.println(p1.toString());
    }
}