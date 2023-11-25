package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public CuentaBancaria buscar(String numero);
	public void guardar (CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void elimiar(String numero);
}
