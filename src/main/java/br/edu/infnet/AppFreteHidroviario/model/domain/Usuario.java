package br.edu.infnet.AppFreteHidroviario.model.domain;

public class Usuario {
	
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	
	
	public Usuario() {
		
	}
	
	public Usuario(String email, String senha) {
		this();
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);
	}

	@Override
	public String toString() {
		return String.format("nome=%s, email= %s, senha= %s", nome, email, senha);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
