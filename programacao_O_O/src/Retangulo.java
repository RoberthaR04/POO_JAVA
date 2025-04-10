
public class Retangulo {
    //atributos
    double largura;

    double altura;


    public double area(){
        return altura * largura;
    }

    public void imprimir(){
        System.out.println("-----");
        System.out.println("altura=" +altura);
        System.out.println("largura=" +largura);
        System.out.println("área="+ area());

    }
}