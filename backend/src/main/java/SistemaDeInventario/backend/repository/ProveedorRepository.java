package SistemaDeInventario.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SistemaDeInventario.backend.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}