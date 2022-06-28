package testeTecnico;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao01 {
    public static void questao01() {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe a quantidade de colunas");
        int N = scan.nextInt();
        System.out.println("informe a quantidade de linhas");
        int M = scan.nextInt();
        int[][] matriz = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("informe um número para a linha "+i+" e coluna "+j);
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int[] linha : matriz){
            System.out.println(Arrays.toString(linha));
        }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                        System.out.println("valor : " + matriz[i][j]);
                        try {
                            System.out.println("o valor a esquerda é: " + matriz[i][j - 1]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("não há valor a esquerda");
                        }
                        try {
                            System.out.println("o valor a direita é: " + matriz[i][j + 1]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("não há valor a direita");
                        }
                        try {
                            System.out.println("o valor acima é: " + matriz[i - 1][j]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("não há valor acima");
                        }
                        try {
                        System.out.println("o valor abaixo é: " + matriz[i + 1][j]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                              System.out.println("não há valor abaixo");
                        }
                    }
                }
            }
        }
