package com.jbobadilla.interfaces.repository;

import com.jbobadilla.interfaces.model.Cliente;

import java.util.List;

public interface PaginableRepository {
    List<Cliente> listar(int desde, int hasta);
}
