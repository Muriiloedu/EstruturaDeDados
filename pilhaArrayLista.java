package model;

import java.util.ArrayList;
import java.util.Scanner;

public class pilhaArrayLista<T> {

        // Atributo que Armazena os Elementos da Pilha Utilizando ArrayList
        private ArrayList<T> elementos;

        // Construtor> Inicializa a Pilha com uma Lista Vazia
        public pilhaArrayLista() {
            elementos = new ArrayList<>(); // Criando uma Lista Dinâmica para Armazenar os Elementos da Pilha
        }

        // Método para Verificar se a Pilha está Vazia
        public boolean estaVazia() {
            return elementos.isEmpty(); // Retorna TRUE se a Lista não Contiver Elementos
        }

        // Método para Empilhar (Adicionar) um Elemento no Topo da Pilha
        public void empilhar (T item) {
            elementos.add(item); // Adiciona o Item no Final da Lista (equivalente ao topo da pilha)
        }

        // Método para Desempilhar (Remover) o Elemento no Topo da Pilha

        public T desempilhar() {
            if (estaVazia()) {
                System.err.println("Erro: A pilha está vazia! Não há elementos para remover.");
                return null;
            }
            return elementos.get(elementos.size() - 1); // Remover e Retorna o Último Elemento da Lista (topo da pilha)
        }

        // Método para Vizualizar o Elemento do Topo sem Removê-lo
        public T topo() {
            if (estaVazia()) {
                System.err.println("Erro: A pilha está vazia! Não há elementos no topo.");
                return null; 
            }
            return elementos.get(elementos.size() - 1); // Remover e Retorna o Último Elemento da Lista (topo da pilha)
        }
        // Método que Retorna o Tamanho da Pilha
        public int tamanho() {
            return elementos.size(); // Retorna a Quantidade de Elementos na Pilha
        }

        // Método que Exibe Todos os Elementos da Pilha (de cima para baixo)
        public void exibirPilha() {
            if (estaVazia()){
                System.err.println("A pilha está VAZIA!");
                return;
            }
            System.out.println("\n Elementos da Pilha (do topo para a base): ");
            for (int  i = elementos.size() -1; i >= 0; i--) {
                System.out.println("| " + elementos.get(i) + "  ");
            }
            System.out.println("=====");
        }

        // Método Interativo para Testar o Funcionamneto da Pilha
    public static void main(String[] args) {
        pilhaArrayLista<String> pilha = new pilhaArrayLista<>(); // Cria a Pilha de Strings
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            // Menu Interativo
            System.out.println("\n====== MENU PILHA =======");
            System.out.println("1 - Empilhar Elemento");
            System.out.println("2 - Desempilhar Elemento");
            System.out.println("3 - Vizualizar Topo");
            System.out.println("4 - Tamanho da Pilha");
            System.out.println("5 - Exibir Pilha");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma Opção: ");

            if (!scanner.hasNext()) {
                System.out.println("Entrada Inválida! Digite um número.");
                scanner.next(); // Descarta Entrada Inválida
                continue;
            }

            // 18/03
            opcao = scanner.nextInt();
            scanner.nextLine(); //Quebra a linha

            // SWITCH para avaliara opção escolhida e direciona para a ação correspondente
            switch (opcao) {
                case 1: // Para empilhar
                    System.out.println("digite o elemento a ser pilhado");
                    String elemento = scanner.nextLine();
                    pilha.empilhar(elemento);
                    System.out.println(" Elemento" + elemento + " empilhado com sucesso!");
                    break;
                
                case 2: //Para desempilhar
                    String desempilhado = pilha.desempilhar();
                    if (desempilhado != null) {
                        System.out.println(" Elemento removido: "+desempilhado);
                    }
                    break;

                case 3: // visulisar o elemento no topo da pilha
                    String topo = pilha.topo();
                    if (topo != null) {
                        System.out.println("Topo da pilha: " + topo);
                    }
                    break;

                case 4: //exibir o tamanho da pilha
                    System.out.println("Tamanho da pilha: " + pilha.tamanho());
                    break;
                    
                case 5: // exibir todos os elementos da pilha
                    pilha.exibirPilha();
                    break;
            
                default: // caso nenhuma opcão seja valida
                if (opcao != 0) {
                    System.out.println("Opç~~ao invalida!! tente novamente.");
                    break;
                }
                    break;
            }
        }while (opcao != 0);
    
        scanner.close();
    }
    
}

