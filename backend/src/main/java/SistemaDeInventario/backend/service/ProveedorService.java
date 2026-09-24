package SistemaDeInventario.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SistemaDeInventario.backend.entity.Proveedor;
import SistemaDeInventario.backend.repository.ProveedorRepository;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public List<Proveedor> listar() {
        return repository.findAll();
    }
}