package br.com.michellibrito.youtube;

//para caso você queira que essa interface seja funcional, só anota com isso
//caso contrário ela deixa de ser uma classe funcional
//contudo vc pode adicionar outros métodos como defaults
@FunctionalInterface
public interface Autentica {
	public abstract boolean autenticaSenha(String senha);
}
