public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.ligar();
        System.out.println("Ligada!" +l1.ligada);
        l1.desligar();
        System.out.println("Ligada!" +l1.ligada);


    }
}