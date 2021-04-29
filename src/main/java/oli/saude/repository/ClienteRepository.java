package oli.saude.repository;

import java.util.ArrayList;
import java.util.List;

import oli.saude.entity.Cliente;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {

	public void save(Cliente cliente) {
		System.out.println(cliente.toString());
	}

	public List<Cliente> listarClientes() {
		List<Cliente> lista = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Julliana");
		cliente1.setSexo("feminino");
		cliente1.setDataNascimento("30/12/1990");
		lista.add(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pai");
		cliente2.setSexo("masculino");
		cliente2.setDataNascimento("30/12/1990");
		lista.add(cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Mãe");
		cliente3.setSexo("feminino");
		cliente3.setDataNascimento("30/12/1990");
		lista.add(cliente3);

		Cliente cliente4 = new Cliente();
		cliente4.setNome("Irmã");
		cliente4.setSexo("feminino");
		cliente4.setDataNascimento("30/12/1990");
		lista.add(cliente4);

		return lista;
	}
}
