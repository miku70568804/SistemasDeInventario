package SistemaDeInventario.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SistemaDeInventario.backend.entity.Producto;
import SistemaDeInventario.backend.service.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping("/productos")
    public List<Producto> listar() {
        return service.listar();
    }

    @PostMapping("/productos")
    public Producto guardar(@RequestBody Producto producto) {
        return service.guardar(producto);
    }
}