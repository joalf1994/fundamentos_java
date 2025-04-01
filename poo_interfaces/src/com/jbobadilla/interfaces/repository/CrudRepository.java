package com.jbobadilla.interfaces.repository;

import com.jbobadilla.interfaces.model.Cliente;

import java.util.List;

public interface CrudRepository {
    List<Cliente> listar();
    Cliente byId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
