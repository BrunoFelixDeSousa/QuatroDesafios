package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        List<Integer> arrayIntPares = new ArrayList<>();
        List<Integer> arrayIntImpares = new ArrayList<>();

        try {
            if (valor <= 1 || valor > 100000) {
                throw new IllegalArgumentException("Valor não pode ser menor que 1 ou maior/igual a 10 elevado 5");
            }

            lerArrays(sc, valor, arrayIntPares, arrayIntImpares);

            Collections.sort(arrayIntPares);
            Collections.sort(arrayIntImpares, Collections.reverseOrder());

            imprimirLista(arrayIntPares);
            imprimirLista(arrayIntImpares);

        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            sc.close();
        }
    }

    private static void lerArrays(Scanner sc, int valor, List<Integer> arrayIntPares, List<Integer> arrayIntImpares) {
        for (int contador = 0; contador < valor; contador++) {
            int valorAuxiliar = sc.nextInt();
            if (valorAuxiliar % 2 == 0) {
                arrayIntPares.add(valorAuxiliar);
            } else {
                arrayIntImpares.add(valorAuxiliar);
            }
        }
    }

    private static void imprimirLista(List<Integer> lista) {
        for (Integer valor: lista) {
            System.out.println(valor);
        }
    }
}