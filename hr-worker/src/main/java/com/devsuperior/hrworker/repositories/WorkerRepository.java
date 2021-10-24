package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
/* irá conter métodos para acesso à dados (buscar, salvar, etc.)*/
}
