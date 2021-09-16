package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	
	@Autowired
	public MedicamentoRepository repository;

	@Override
	public List<Medicamento> buscaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medicamento> buscaPorStock(int stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Medicamento> buscaPorId(int idMedicamento) {
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> listaMedicamento() {
		return repository.findAll();
	}
	
		
}
