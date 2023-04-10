package com.pardraocoportamental.atividadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeDesignPatternApplication.class, args);
		MaquinaRefrigerantes maquina = new MaquinaRefrigerantes(3);
		maquina.inseriuMoeda();
		maquina.despejarRefrigerante();
	}

}
