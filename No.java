package model;

// padrão MVC - model view controller

//Esta classe representa o bloco base de uma lista ligada: o nó (ou elemento da lista)
public class No{
    // esta atributo é uma referencia(ponteiro), para o próximo nó na sequencia da lista.
    private Object info; // info é um atributo para armazenar o no

    private No proximoNo;

    //este e o primeiro No da classe. 
    // Quando criamos um novo nó, já podemos dizer:
    // - Qual valor ele ira guardar
    // - e para qual nó ele vai apontar em seguida (proximoNo)

    public No(Object info, No proximoNo){
        this.info = info;
        this. proximoNo = proximoNo;
    }

    // métodos getters e setters - usado para acessar é modificar os atributos privados

    //Retorna o que o nó esta aguardando
    public Object getInfo(){
        return info;
    }

    // Altera o valor aemazenado no nó
    public void setInfo(Object info){
        this.info = info;
    }

    // Retorna o no seguinte ao atual (Pode ser null se for o ultimo)
    public No getProximoNo(){
        return proximoNo;
    }

    // Define qual sera o proximo nó na lista (encadeamento)
    public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }
}