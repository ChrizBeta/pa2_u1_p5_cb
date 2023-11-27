package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U1P5CbApplication implements CommandLineRunner {

	@Autowired 
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private ICuentaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		CuentaBancaria ctaOrigen = new CuentaBancaria();
		ctaOrigen.setCedulaPropietario("1722781000");
		ctaOrigen.setSaldo(new BigDecimal(100));
		ctaOrigen.setNumero("4321");
		this.bancariaService.guardar(ctaOrigen);
		
		CuentaBancaria ctaDestino = new CuentaBancaria();
		ctaDestino.setCedulaPropietario("1708254329");
		ctaDestino.setSaldo(new BigDecimal(200));
		ctaDestino.setNumero("1234");
		this.bancariaService.guardar(ctaDestino);
		
		this.iTransferenciaService.realizar("4321", "1234", new BigDecimal(10));
		
		CuentaBancaria ctaOrigen1 = this.bancariaService.buscar("1234");
		System.out.println(ctaOrigen1);
		
		CuentaBancaria ctaDestino1 = this.bancariaService.buscar("4321");
		System.out.println(ctaDestino1);
		
		
		
		
	}
}
