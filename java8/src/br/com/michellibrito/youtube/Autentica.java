package br.com.michellibrito.youtube;

//para caso voc� queira que essa interface seja funcional, s� anota com isso
//caso contr�rio ela deixa de ser uma classe funcional
//contudo vc pode adicionar outros m�todos como defaults
@FunctionalInterface
public interface Autentica {
	public abstract boolean autenticaSenha(String senha);
}
