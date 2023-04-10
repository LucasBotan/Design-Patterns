package com.pardraocoportamental.atividadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeDesignPatternApplication.class, args);

		Cafe cafe = new Cafe();
        Cha cha = new Cha();

        cafe.preparar();
        /*
          Esquentando água
          Moendo café
          Colocando no copo
          Adicionando açúcar e leite
        */

        cha.preparar();
        /*
          Esquentando água
          Preparando o saquinho de chá
          Colocando no copo
          Adicionando algumas gotas de limão
        */
	}

}
