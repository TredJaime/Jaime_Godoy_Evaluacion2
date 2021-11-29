package com.nttdata.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Producto;

@Repository
public interface TiendaRepository extends JpaRepository<Producto, Long> {
	
}
