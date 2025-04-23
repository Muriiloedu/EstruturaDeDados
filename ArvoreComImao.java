package Arvores.Aula22;


class No{
    int valor; // valor armazenado do no
    No esquerdo, direito; // Referencia para filhos
    
    //contrutor para inicializar o no com um valor
    
    public No(int item){
        valor = item; // define o vaolo do primeiro no
        esquerdo = direito = null; //inicializa os valores com null
    }
}


class ArvoreBinaria {
    No raiz; // Raiz da arvore
    
    // metodo para verificar se dois nos são irmaos
    boolean saoIrmao(No no, int a, int b){
        if (no == null) { //caso base, se o no for null, retorna false
            return false;
        }
        // verefica se os dois valores são filhos do mesmo no ou qualquer ordem
        return (no.esquerdo != null && no.direito != null && no.esquerdo.valor == a && no.direito.valor == b) ||
                (no.esquerdo != null && no.direito != null && no.esquerdo.valor == b && no.direito.valor == a) ||
                // recursivamente verefica nos filhos esquerdo e direito
                saoIrmao(no.esquerdo, a, b) ||
                saoIrmao(no.direito, a, b);
    }

    public static void main(String[] args) {
       ArvoreBinaria arvore = new ArvoreBinaria();
       arvore.raiz = new No(1); // define valor raiz com 1
       arvore.raiz.esquerdo = new No(2);
       arvore.raiz.direito = new No(2);
       arvore.raiz.esquerdo.esquerdo = new No(4);
       arvore.raiz.esquerdo.direito = new No(5);
       arvore.raiz.direito.esquerdo = new No(6);
       arvore.raiz.direito.direito = new No(7);

        //testa se 4 e 5 são irmaos
       System.out.println(arvore.saoIrmao(arvore.raiz, 4, 5)); // true
        //testa se 4 e 6 são irmaos
        System.out.println(arvore.saoIrmao(arvore.raiz, 4, 6)); // false
    }
}