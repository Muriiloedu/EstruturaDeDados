package Aula3;

import java.util.Scanner;

public class SomatorioDeNumeros {
    //  Metodo p/ somar de 1 ate n
    public static int somatorio(int n){
        //  caso exemplificado: se n for igual a 1, retorna(para a recursão)
        if (n == 1) {
            return 1;
        } else {
            // passo resursivo soma o numero atual com o somatorio anterior
            return n +somatorio(n -1);
        }
    }

    public static void main(String[] args) {
        // criação do scanner p/ dados do usuario

        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "Digite um numero para calcular o somatorio: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.err.println("Erro: o numero deve ser positivo e maior ou igual a um");
        }else{
            // chama o metodo somatorio
            int resultado = somatorio(n);
            System.out.println(" a soma de 1 ate " + n + " e: " + resultado);
        }
        scanner.close();
    }
}
