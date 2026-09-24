package SistemaDeInventario.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SistemaDeInventario.backend.entity.Cliente;
import SistemaDeInventario.backend.service.ClienteService;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping("/clientes")
    public Cliente guardar(@RequestBody Cliente cliente) {
        return service.guardar(cliente);
    }
}