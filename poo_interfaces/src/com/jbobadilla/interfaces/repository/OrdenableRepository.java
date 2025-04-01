package com.jbobadilla.interfaces.repository;

import com.jbobadilla.interfaces.model.Cliente;

import java.util.List;

public interface OrdenableRepository {
    List<Cliente> listar(String campo, Direccion direccion);
}
