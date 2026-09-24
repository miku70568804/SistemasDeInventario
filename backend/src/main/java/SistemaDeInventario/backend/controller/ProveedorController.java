package SistemaDeInventario.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import SistemaDeInventario.backend.entity.Proveedor;
import SistemaDeInventario.backend.service.ProveedorService;

@RestController
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping("/proveedores")
    public List<Proveedor> listar() {
        return service.listar();
    }
}