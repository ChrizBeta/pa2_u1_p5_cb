package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5CbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HOLA MUNDO");
		System.out.println("SOY CHRISTIAN BETANCOURT");
		System.out.println("mi segunndo commit");
		System.out.println("Cambio a nueva rama taller 3");
		
	}
}
