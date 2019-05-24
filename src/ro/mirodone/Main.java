package ro.mirodone;

public class Main {

    public static void main(String[] args) {
        //testing Caesar cipher

        CaesarCipher c = new CaesarCipher();
        System.out.println(c.decode("evqv"));
        System.out.println(c.decode("diozmqdzr"));
//testing code Caesar cipher
        CodeCaesar cc = new CodeCaesar();
        System.out.println(cc.code("java"));
        System.out.println(cc.code("interview"));
    }
}
