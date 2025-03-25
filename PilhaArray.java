package model;

public class PilhaArray {
    
    private Object[] pilha; //Armazena os elementos da pilha
    private int topo; // indice de topo da pilha

    
    
        //contrutor que define o tamanho da pilha
        public void pilhaArray(int tamanho){
            pilha = new Object[tamanho];
            topo = -1; //indica que a oilha estara vazia inicialmente 
        }
    
        //metodo que verefia se a pilha esta vazia
        public boolean estavazia(){
            return topo == -1;
        }
    
         //metodo que verifica se a pilha esta cheia
         public boolean estacheia(){
            return topo == pilha.length -1;
        }
    
        //metodo para empilhar os elementos
        public void empilhar(Object elemento){
            if (estacheia()) {
                System.err.println("Erro: a pilha esta cheia! não é possivel adicionar mais elementos.");
            }else{
                pilha [++topo] = elemento; //incrementa e adiciona elemento
                System.out.println("Elemento"+ elemento + "empilhado com sucesso");
            }
        }
    
         //metodo para desempilhar os elementos
         public Object desempilhar(){
            if (estavazia()) {
                System.err.println("Erro: a pilha esta vazia! não há elementos para remover.");
                return null;
            }else{
                Object elementoRemovido = pilha[topo];
                pilha [topo--] = null; //remove elemento
                System.out.println("Elemento"+ elementoRemovido + "removido com sucesso");
                return elementoRemovido;
            }
        }
    
    
        // metodo pra obter o elemento do topo sem remover
        public Object topo(){
            if (estavazia()) {
                System.out.println("Erro: a pilha está vazia!Sem topo");
            }
            return pilha[topo];
        }
    
    
        public static void main(String[] args) {
            //TODO Auto-generated constructor stub
            //Criando uma pilha tamanho 5
            PilhaArray pilha = new PilhaArray();

        //testando a empilhagem dos elementos
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6); // <- exibira erro(pilha cheia)

        //testando desempilhar
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar(); // <-exibira erro(pilha sem elementos)
        
    }
}
