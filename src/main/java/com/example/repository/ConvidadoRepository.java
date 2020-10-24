package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.models.Convidado;
import com.example.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
}
