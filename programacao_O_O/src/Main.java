import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args){
        //criei um objeto do tipo retangulo
        //new reserva um espaço na memoria para o objeto
        //vai devolver o endereço de memoria
        //retangulo() é um metodo especial, chamado contrutor
        //construtor padrao
        Retangulo r1 = new Retangulo();
        r1.altura = 10;
        r1.largura=20;
        System.out.println("altura=" +r1.altura);
        System.out.println("largura=" +r1.largura);
        System.out.println("área="+r1.area());
    }

}