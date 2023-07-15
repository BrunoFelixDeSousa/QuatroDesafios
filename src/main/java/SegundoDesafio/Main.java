package SegundoDesafio;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double valor = sc.nextDouble();

        int valorInteiro = (int) valor;
        int notas100 = valorInteiro / 100;
        valorInteiro %= 100;
        int notas50 = valorInteiro / 50;
        valorInteiro %= 50;
        int notas20 = valorInteiro / 20;
        valorInteiro %= 20;
        int notas10 = valorInteiro / 10;
        valorInteiro %= 10;
        int notas5 = valorInteiro / 5;
        valorInteiro %= 5;
        int notas2 = valorInteiro / 2;
        valorInteiro %= 2;

        double valorDecimal = valor - (int) valor + valorInteiro;

        int moedas1 = (int) (valorDecimal / 1);
        valorDecimal %= 1;
        int moedas50 = (int) (valorDecimal / 0.50);
        valorDecimal %= 0.50;
        int moedas25 = (int) (valorDecimal / 0.25);
        valorDecimal %= 0.25;
        int moedas10 = (int) (valorDecimal / 0.10);
        valorDecimal %= 0.10;
        int moedas5 = (int) (valorDecimal / 0.05);
        valorDecimal %= 0.05;
        int moedas1Cent = (int) (valorDecimal / 0.01);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas1Cent + " moeda(s) de R$ 0.01");

        sc.close();
    }
}