package com.pardraocoportamental.atividadeDesignPattern;

public class Produto {
    
    private String nome;
    private float preco;
    private float valorFrete;
    private float acrescimo;

    public Produto (String nome, float preco, float valorFrete, float acrescimo){
        this.nome = nome;
        this.preco = preco;
        this.valorFrete = valorFrete;
        this.acrescimo = acrescimo;
    }

    public Object accept(Visitor visitor){
        return visitor.visit(this);
    }

    public float getPreco(){
        return preco;
    }

    public float getvalorFrete(){
        return valorFrete;
    }

    public float getacrescimo(){
        return acrescimo;
    }

}
