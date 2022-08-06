package br.com.carvalho.annotation;

/**
 * 
 * @author manoel.carvalho
 *
 */


public class Tabela {
	
	@NomeTabela(automoveis = { "fusca","uno","chevete","kombi" })
	private String carro;
	
	@NomeTabela(automoveis = { "fusca","uno","chevete","kombi" })
	public Tabela() {
		
	}
	


}
