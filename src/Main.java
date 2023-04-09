import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vecto[] = {8,4,7,2,8,2,9,1,0};

        System.out.println("Original:");
        System.out.println(Arrays.toString(vecto));

        quickSort(vecto, 0, 8);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vecto));

    }

    private static void quickSort(int[] lista, int esquerda, int direita){
        int tmp, i = esquerda, j = direita;
        int pivo = lista[(esquerda + direita) / 2];

        while (i <= j) {
            while (lista[i] < pivo){
                i++;
            }
            while (lista[j] > pivo){
                j--;
            }
            if (i <= j){
                tmp = lista[i];
                lista[i] = lista[j];
                lista[j] = tmp;
                i++;
                j--;
            }
        }

        if (esquerda < j){
            quickSort(lista, esquerda, j);
        }
        if (i < direita){
            quickSort(lista, i, direita);
        }
    }
}