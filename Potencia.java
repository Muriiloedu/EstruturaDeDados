package Aula3;

import java.util.Scanner;

public class Potencia {
    // metodo para calcular a potencia
    public static double potencia(double x, int y){
         //  caso exemplificado: se n for igual a 0, resultado sera 1
         if (y== 0) {
            return 1;
        } else {
            // passo resursivo multiplica x por potencia(x, y, -1)
            return x * potencia(x, y -1);
        }
    }

    public static void main(String[] args) {
        // criação do scanner p/ dados do usuario

        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "Digite a base");
        double x=scanner.nextDouble();

        System.out.println( "Digite o expoente");
        int y =scanner.nextInt();

        if ( y < 0) {
            System.out.println(" o expoente deve ser maior ou igual a zero");
        }else{
            double resultado = potencia(x, y);
            System.out.println(x + " Elevado a potencia de  "+  y + "é: " + resultado);
        }
        scanner.close();
    }
}
