package SistemaDeInventario.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/productos/{id}")
    public Producto buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping("/productos")
    public Producto guardar(@RequestBody Producto producto) {
        return service.guardar(producto);
    }

    @DeleteMapping("/productos/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}