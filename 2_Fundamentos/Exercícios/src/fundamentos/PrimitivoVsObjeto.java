package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        // Atribuição para psicopatas que amam OO: String s = new String("texto");
        String s = "texto";
        s.toUpperCase();

        // Tudo em Java são objetos, menos os oito tipos primitivos.
        // Wrappers são a "objetificação" deles.
        int a = 123;
        System.out.println(a);
    }
}
