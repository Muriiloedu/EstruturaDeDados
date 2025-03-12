package Aula3;

import java.util.Scanner;

public class Fatorial {
    // metodo par calcular o fatorial de um numero
    public int fatorial(int n){
        // se n for igual a zero, então retorna 1
        if(n == 0){
            return 1;
        }
        // verifica numero menor que zero
        if (n < 0) {
            throw new IllegalArgumentException("o Numero não pode ser negativo");
        }
        else{
            //para qualquer outro numero calculasse o valor multiplicado pelo seu antecessor
            return n * fatorial(n -1); 
        }
    }
    
    public static void main(String[] args) {
        // criação do scanner p/ dados do usuario

        Scanner scanner = new Scanner(System.in);
        Fatorial f = new Fatorial();
        
        System.out.println( "Digite um numero para calcular o fatorial: ");
        int numero = scanner.nextInt();

        try{
            // chama e exibe o resultado
            System.out.println("o fatorial de "+ numero + "e: " + f.fatorial(numero));
        }catch(IllegalArgumentException e){
            System.out.println("Erro:" + e.getMessage());
        }
        scanner.close();
    }
}