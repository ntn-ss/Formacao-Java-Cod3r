package fundamentos;

public class Wrappers {
    public static void main(String[] args) {

        // Wrappers = "objetificadores" dos tipos primitivos
        Byte b = 100; //byte
        Short s = 1_000; //short
        Integer i = 10_000; //int
        Long l = 1_000_000L; //long
        
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bool = Boolean.parseBoolean("true"); //boolean
        System.out.println(bool);
        System.out.println(bool.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c.toString());
    }
}