public class Circulo {
    double raio;
    public double area(){
        return Math.PI * raio * raio;

    }
    public void imprir(){
        System.out.println("raio: "+ raio);
        System.out.println("área:"+ area());
    }
}

