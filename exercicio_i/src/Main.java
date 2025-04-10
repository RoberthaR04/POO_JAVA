//Quest˜ao 10 Escreva um classe chamada Main com um m´ etodo est´atico que receba dois
// parˆametros inteiros e retorne a divis˜ao entre eles. O m´ etodo deve tratar um poss´ ıvel erro
// de divis˜ao por zero. Caso ocorrer, o m´ etodo deve retornar-1

public class Main {
    public static int div(int a, int b) {
        if (b == 0) {
            // Se o divisor (b) for zero, retorna -1
            System.out.println("Erro: Divisão por zero.");
            return -1;
        }
        return a / b;
    }
    public static void main(String[] args){
        int n1=10;
        int n2=0;
        int total = div(n1,n2);
        System.out.println("O total da divisão é"+ total);

    }
}