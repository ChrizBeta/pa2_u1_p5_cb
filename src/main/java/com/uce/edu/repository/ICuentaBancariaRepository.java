package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	public CuentaBancaria seleccionar(String numero);
	
	public CuentaBancaria seleccionarEliminar(String numero);

	public void insertar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void eliminar(String numero);
	
}
