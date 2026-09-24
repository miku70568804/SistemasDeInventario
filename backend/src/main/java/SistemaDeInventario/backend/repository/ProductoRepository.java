package SistemaDeInventario.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SistemaDeInventario.backend.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}