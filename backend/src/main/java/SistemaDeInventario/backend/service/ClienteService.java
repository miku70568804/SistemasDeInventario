package SistemaDeInventario.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SistemaDeInventario.backend.entity.Cliente;
import SistemaDeInventario.backend.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return repository.save(cliente);
    }
}