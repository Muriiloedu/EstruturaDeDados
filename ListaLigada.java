package model;

import java.util.Scanner;

//   Esta classe representa uma lista ligada simples
//   ela possui  3 atributos principais:
//   - primeiroNo: referencia para o inicio da lista
//   - ultimoNo: "" Para o fim da lista
//   - quantidadeNo: contador na lista

public class ListaLigada {
    private No primeiroNo;
    private No ultimoNo;
    private int quantidadeNo;

    // Construtor: cria uma nova lista com um primeiro elemento.
    // Esse primeiro elemento já vira o inicio e o fim da lista.

    public ListaLigada(Object ElementoInicial){
        No novoNo = new No(ElementoInicial, null); // o proximo é null pois esse é o unico elemento
        this.primeiroNo = novoNo;
        this.ultimoNo = novoNo;
        this.quantidadeNo = 1;
    }

    // Metodo publico que adiciona um novo elemento ao final da lista
    // cria um novo no como elemento passado
    // atualiza o ultimo no anterior, para apontar para esse novo no
    // atualiza o ponteiro ultimo no da lista

    public void adicionar(Object elemento){
        No novoNo = new No(elemento, null); // o proximo é null pois esse é o unico elemento
        this.ultimoNo.setProximoNo(novoNo);//conecta o antigo ultimo nó da lista
        this.ultimoNo = novoNo;
        this.quantidadeNo++;
    }

    //Metodo que retorna aquantidade de elementos atualmente presentes na lista.
    public int tamanhoLista(){
        return quantidadeNo;
    }

        /*
        * este metodo pescorre a lista a partir do primeiro No
        * Concaternando os valores em uma String para a visualização.
        */
    public String imprimirLista(){
        StringBuilder sb = new StringBuilder(); // StringBuilder é mais eficiente para concaternar
        No atual = primeiroNo;

        while (atual != null){
            // != para enverter o resultado, por exemplo, !true = false = True, vice versa
            sb.append(atual.getInfo()).append("->");
            atual = atual.getProximoNo(); //Avança para o proximo Nó
        }
        sb.append("null"); // Fim da lista
        return sb.toString(); // Retorna uma string tipo: "A -> B -> C -> NULL"
    }

    //METODO PARA EXIBIR A LISTA DIRETO NO CONSOLE 
    private void exibirListaNoconsole(){
        System.out.println("\nLista construida");
        System.out.println(imprimirLista());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //para a entrada de dados

        System.out.println(" ==== Lista Ligada Interativa ====");
        System.out.println(" Digite o primeiro valo da lista: ");
        String primeiro = scanner.nextLine(); //Le o primeiro  valor e inicializa a lista

        // Cria a lista com o primeiro valor fornecido pelo usuario
        ListaLigada lista = new ListaLigada(primeiro);

        //Laço para adicionar mais elementos enquanto o usuario assim desejar
        while (true) {
            System.out.println(" Deseja adicionar outro valor? (s\n)");
            String opcao= scanner.nextLine();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.println("Digite o proximo valor: ");
                String valor = scanner.nextLine();
                lista.adicionar(valor); // Adiciona valor a lista
            } else if (opcao.equalsIgnoreCase("n")) {
                break; // Sai do laço e exibe a lista
            } else{
                System.err.println(" Opção invalida! Digite 's' para sim ou 'n' para não");
            }
        }

        //Exibe lista final no console 
        lista.exibirListaNoconsole();

        scanner.close();
    }
}
