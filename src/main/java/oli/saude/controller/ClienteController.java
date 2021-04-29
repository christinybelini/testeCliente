package oli.saude.controller;

import java.util.List;

import javax.validation.Valid;

import oli.saude.entity.Cliente;
import oli.saude.request.ClienteRequest;
import oli.saude.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService service;

	@PostMapping
	public ResponseEntity<HttpStatus> criarCliente(
			@Valid @RequestBody ClienteRequest request) {
		service.criar(request);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	public void alterarCliente() {

	}

	public void buscarClienteNome() {

	}

	@GetMapping
	public List<Cliente> listarCliente() {
		return service.listar();
	}

	public void riscoSaude() {

	}
}
