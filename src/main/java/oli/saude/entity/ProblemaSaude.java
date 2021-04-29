package oli.saude.entity;

import org.springframework.stereotype.Component;

@Component
public class ProblemaSaude {
	private String nome;
	private int grau;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the grau
	 */
	public int getGrau() {
		return grau;
	}
	/**
	 * @param grau the grau to set
	 */
	public void setGrau(int grau) {
		this.grau = grau;
	}

}
