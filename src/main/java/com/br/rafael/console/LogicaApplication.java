package com.br.rafael.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nome[] = new String[5];

		System.out.println("****** Exercício pra casa 22/08 ******");
		for(int i = 0; i < 5; i++){
			System.out.print("Informe o " + (i + 1) + "º nome: ");
			nome[i] = reader.readLine();
		}
		System.out.println("**************************************");
		System.out.println("Os nomes digitados foram: ");
		for(int i = 0; i < 5; i++){
			System.out.println((i + 1) + " - " + nome[i]);
		}
		System.out.println("************** - fim - ***************");
		//SpringApplication.run(LogicaApplication.class, args);
	}

}
