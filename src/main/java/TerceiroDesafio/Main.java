package TerceiroDesafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoDoArray = sc.nextInt();
        int valorAlvo = sc.nextInt();

        Integer[] array = new Integer[tamanhoDoArray];

        for (int i = 0; i < tamanhoDoArray; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(contagemDeParesComDiferenca(array, valorAlvo));
    }

    private static int contagemDeParesComDiferenca(Integer array[], int valorAlvo) {

        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] - array[k] == valorAlvo){
                    contador++;
                }
            }
        }
        return contador;
    }
}
