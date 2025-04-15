public class Circulo {
    private double raio;

    // Construtor

    public Circulo(double raio){
        if (raio < 0){
            System.out.println("Valor inválido");
            this.raio = 0;
        } else {
            this.raio = raio;
        }
    }
    //metodo para calcular a area
    public double circulaArea(){
        return  Math.PI * raio * raio;
    }

    //metodo para calcular o perimetro
    public double circulaP(){
        return  2 * Math.PI * raio;
    }

    //metodo para mostrar os valores calculados
    public void exibir(){
        System.out.println("Valor do raio: " + raio);
        System.out.println("Valor da área: " + circulaArea());
        System.out.println("Valor do perímetro: " + circulaP());
    }

    // para validar os valores
    //get

    public double getraio(){
        return raio;
    }

    //setter com validaçao

    public void setraio(double raio){
        if (raio < 0){
            System.out.println("Valor inválido");
        } else {
            this.raio = raio;
        }
    }

}
