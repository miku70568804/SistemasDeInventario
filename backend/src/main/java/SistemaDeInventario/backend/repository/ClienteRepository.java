package SistemaDeInventario.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SistemaDeInventario.backend.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}