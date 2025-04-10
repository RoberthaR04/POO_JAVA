//Suponha que a classe X possua um m´ etodo est´atico que busca um elemento
// dentro de um vetor de inteiros com a seguinte assinatura: static int buscar(int vetor[], int
// elemento). Crie um teste unit´ario que verifica se o m´ etodo retorna-1 para um elemento
// que n˜ao exista em um determinado vetor

public class Main {
    public static int buscar(int vetor[], int elemento) {
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == elemento){
                return i;
            }
        }
        return -1;
    }
}