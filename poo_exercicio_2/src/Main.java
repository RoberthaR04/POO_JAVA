public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio=4;
        c.area();
        System.out.println("Área do circulo:" + Math.round(c.area()));
    }
}