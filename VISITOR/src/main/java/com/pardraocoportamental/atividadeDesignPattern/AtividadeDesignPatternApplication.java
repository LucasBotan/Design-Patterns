package com.pardraocoportamental.atividadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeDesignPatternApplication {

	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 3500, 50, 10);

		ValorLojaVisitor valorLoja = new ValorLojaVisitor();
		ValorTelefoneVisitor valorTelefone = new ValorTelefoneVisitor();
		ValorSiteVisitor valorSite = new ValorSiteVisitor();

		System.out.println("Valor loja: " + produto.accept(valorLoja));
		System.out.println("Valor telefone: " + produto.accept(valorTelefone));
		System.out.println("Valor loja: " + produto.accept(valorLoja));

	}

}
