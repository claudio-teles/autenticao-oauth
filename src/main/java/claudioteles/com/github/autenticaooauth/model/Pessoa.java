package claudioteles.com.github.autenticaooauth.model;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sexo;
	private String email;
	private Date datadeNascimento;
	private String naturalidade;
	private String nacionalidade;
	private String cpf;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String sexo, String email, Date datadeNascimento, String naturalidade,
			String nacionalidade, String cpf) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.datadeNascimento = datadeNascimento;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatadeNascimento() {
		return datadeNascimento;
	}

	public void setDatadeNascimento(Date datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
