package oli.saude.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private List<ProblemaSaude> problemas;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao
	 *            the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao
	 *            the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	/**
	 * @return the problemas
	 */
	public List<ProblemaSaude> getProblemas() {
		return problemas;
	}

	/**
	 * @param problemas
	 *            the problemas to set
	 */
	public void setProblemas(List<ProblemaSaude> problemas) {
		this.problemas = problemas;
	}

	public String toString() {
		return "Nome: " + nome + "; Data Nascimento: " + dataNascimento
				+ "; Sexo: " + sexo + "; Data Criação: " + new Date();
	}

}
