public class Main {
    public static void main(String[] args) {
        int m[][] = {{4, 8}, {9, 10}};  // Declaração e inicialização da matriz 2x2
        for (int i = 0; i < m.length; i++) {  // Loop para percorrer a matriz
            System.out.println(m[i][i]);  // Imprime os elementos da diagonal principal
        }
    }
}