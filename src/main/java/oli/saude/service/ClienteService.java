package oli.saude.service;

import java.util.List;

import oli.saude.entity.Cliente;
import oli.saude.repository.ClienteRepository;
import oli.saude.request.ClienteRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;

	public void criar(ClienteRequest request) {
		Cliente cliente = new Cliente();
		cliente.setNome(request.getNome());
		cliente.setDataNascimento(request.getDataNascimento());
		cliente.setSexo(request.getSexo());
		// Aqui era para gravar no banco de dados, como não temos vamos chamar a
		// classe
		repository.save(cliente);

	}

	public void alterar() {

	}

	public void buscar() {

	}

	public List<Cliente> listar() {
		return repository.listarClientes();
	}

	public void riscoSaude() {
	}

}
