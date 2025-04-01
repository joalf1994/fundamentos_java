package com.jbobadilla.interfaces.repository;

import com.jbobadilla.interfaces.model.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteListRepository implements CrudRepository, OrdenableRepository, PaginableRepository {

    private List<Cliente> dataSource;

    public ClienteListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente byId(Integer id) {
        Cliente cli = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                cli = cliente;
            }
        }
        return cli;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente clienteAux = this.byId(cliente.getId());
        clienteAux.setNombre(cliente.getNombre());
        clienteAux.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cliente = this.byId(id);
        this.dataSource.remove(cliente);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        List<Cliente> order = dataSource.stream().sorted(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int res = 0;
                if (direccion == Direccion.ASC) {
                    switch (campo) {
                        case "id" ->
                                res = a.getId().compareTo(b.getId());
                        case "nombre" ->
                                res = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                                res = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (direccion == Direccion.DESC) {
                    switch (campo) {
                        case "id" ->
                                res = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                res = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                                res = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return res;
            }
        }).collect(Collectors.toList());
        return order;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
