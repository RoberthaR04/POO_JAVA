
public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();

        for (int i = 0; i < 10; i++) {
            System.out.print(dado.rolar() + " ");
        }

        System.out.println();
    }
}
