package com.uce.edu.repository.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Materia {
	
	private String nombre;
	private Integer numerocreditos;
	private String codigo;
		
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumerocreditos() {
		return numerocreditos;
	}
	public void setNumerocreditos(Integer numerocreditos) {
		this.numerocreditos = numerocreditos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", numerocreditos=" + numerocreditos + ", codigo=" + codigo + "]";
	}
	
	
	

}
