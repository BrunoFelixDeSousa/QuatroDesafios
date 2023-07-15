package QuartoDesafio;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        sc.nextLine();

        String[] fraseArray = new String[loop];

        for (int i = 0; i < loop; i++) {
            fraseArray[i] = sc.nextLine().toUpperCase();
        }

        for (int i = 0; i < loop; i++) {
            char[] charArray = fraseArray[i].toCharArray();
            int tamanhoDoCharArray = charArray.length;
            char[] arrayTemporario = Arrays.copyOfRange(charArray, 0, (tamanhoDoCharArray+1)/2);
            char[] arrayTemporario2 = Arrays.copyOfRange(charArray, (tamanhoDoCharArray+1)/2, tamanhoDoCharArray);
            char[] arrayTemporario3 = reverseArray(arrayTemporario);
            char[] arrayTemporario4 = reverseArray(arrayTemporario2);

            char[] arrayCharFinal = new char[arrayTemporario3.length + arrayTemporario4.length];
            System.arraycopy(arrayTemporario3, 0, arrayCharFinal, 0, arrayTemporario3.length);
            System.arraycopy(arrayTemporario4, 0, arrayCharFinal, arrayTemporario3.length, arrayTemporario4.length);
            System.out.println(arrayCharFinal);

        }
    }

    public static char[] reverseArray(char[] array) {
        for(int i=0; i<array.length/2; i++)
        {
            array[i]^=array[array.length-i-1];
            array[array.length-i-1]^=array[i];
            array[i]^=array[array.length-i-1];
        }
        return array;
    }
}
