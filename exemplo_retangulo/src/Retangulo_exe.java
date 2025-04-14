public class Retangulo_exe {
    double altura;
    double largura;
    //o primeiro metodo a ser executado
    public Retangulo_exe(){
        System.out.println("Construtor");
    }
    public Retangulo_exe(double p_altura, double p_largura){
        //this aponta para o proprio objeto
        this.altura = p_altura;
        this.largura = p_largura;
    }
}
