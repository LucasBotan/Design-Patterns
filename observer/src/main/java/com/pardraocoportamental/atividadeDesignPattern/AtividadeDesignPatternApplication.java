package com.pardraocoportamental.atividadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeDesignPatternApplication.class, args);

		//Observador
		CarroPolicia carroPolicia = new CarroPolicia();

		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();

		// Adiciona observador ao  observado
		carroRoubado.addObserver(carroPolicia);

		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.para();
	}

}
