package interfaces.java.primero.model;

public class Main {

    public static void main(String[] args) {

        SaludoFormal sf = new SaludoFormal("Gerardo");
        System.out.println(sf.saludar());

        SimpleInterface si = new SimpleInterface("Alberto");
        System.out.println(si.saludar());
    }

}
