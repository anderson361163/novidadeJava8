package br.com.michellibrito.youtube;

public class Cliente implements Autentica{

	private String nome;
	private boolean status;
	private String senha;

	public Cliente(String nome, boolean status, String senha) {
		this.nome = nome;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticaSenha(String senha) {
		if(this.senha!=senha) {
			System.out.println("Não autenticado");
			return true;
		}
		System.out.println("Autenticado");
		return false;
	}
}
