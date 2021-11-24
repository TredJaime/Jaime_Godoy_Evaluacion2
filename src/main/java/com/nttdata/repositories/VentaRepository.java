package com.nttdata.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Venta;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {

}
