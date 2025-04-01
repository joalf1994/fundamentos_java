import com.jbobadilla.interfaces.model.Cliente;
import com.jbobadilla.interfaces.repository.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CrudRepository repo = new ClienteListRepository();
        repo.crear(new Cliente("Jane", "Clarent"));
        repo.crear(new Cliente("John", "Sifuentes"));
        repo.crear(new Cliente("Jack", "Galvez"));
        repo.crear(new Cliente("Jill", "Rivera"));

        System.out.println("--------- listar ---------");
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("--------- paginar ---------");
        List<Cliente> paginable = ((PaginableRepository)repo).listar(0,3);
        paginable.forEach(System.out::println);

        System.out.println("--------- ordenar---------");
        List<Cliente> listOrderAsc = ((OrdenableRepository)repo).listar("apellido", Direccion.ASC);
        listOrderAsc.forEach(System.out::println);


        System.out.println("---------editar---------");
        Cliente cliAux = new Cliente("John", "Doe Sanchez");
        cliAux.setId(2);
        repo.editar(cliAux);
        Cliente cliSearch = repo.byId(2);
        System.out.println(cliSearch);

        System.out.println("---------eliminar---------");
        repo.eliminar(2);
        List<Cliente> eliminar = repo.listar();
        eliminar.forEach(System.out::println);




    }
}