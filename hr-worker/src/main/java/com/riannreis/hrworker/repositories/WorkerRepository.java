package com.riannreis.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
