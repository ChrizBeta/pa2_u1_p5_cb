package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Transferencia;

@Repository
public class TransferenciaReposityImpl implements ITransferenciaRepository {

	private static List<Transferencia> base = new ArrayList<Transferencia>();

	@Override
	public Transferencia seleccionar(String numero) {

		for (Transferencia transfer : base) {
			if (transfer.getNumero().equals(numero)) {
				return transfer;
			}
		}
		return null;
	}

	@Override
	public void insertar(Transferencia transferencia) {

		base.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);

	}

	@Override
	public void eliminar(String numero) {
		Transferencia tranferencia = this.seleccionar(numero);
		base.remove(tranferencia);
	}

	@Override
	public List<Transferencia> seleccionarTodos() {
		return base;
	}

}
