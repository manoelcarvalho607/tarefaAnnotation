package br.com.carvalho.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;




/**
 * 
 * 
 * @author manoel.carvalho
 * 
 * implementando nas annotations reflect
 *
 */

public class AppTabela {

	public static void main(String[] args)  {
		   //executeLeituraAnotacao();
		   //executeFields();
		
		try {
			executeConstructor();
		} catch (NoSuchMethodException e) {
			System.out.println("Erro: " + e);
		} catch (SecurityException e) {
			System.out.println("Erro: " + e);
		}
	}

	private static void executeLeituraAnotacao() {
		System.out.println("--- Annotations ---");
		System.out.println("");
		
		
		Class tabela = Tabela.class;
		System.out.println("nome da classe: " + tabela);
		System.out.println("");
		
		Tabela tabela1 = new Tabela();
		
		 
		if (tabela1.getClass().isAnnotationPresent(NomeTabela.class)) {
			NomeTabela nt = tabela1.getClass().getAnnotation(NomeTabela.class);
			System.out.println("nome da anotação: " + nt.getClass().getName());
			System.out.println("valor da anotação: " + nt.value());
		}
	

	}

	private static void executeFields() {
		System.out.println("--- Propriedades ---");
		System.out.println("");
		Tabela tabela = new Tabela();
		Field[] fields = tabela.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println("nome completo: " + field);
			System.out.println("Nome simples: " + field.getName());
			System.out.println("Tipo de propriedade: " + field.getType());
			System.out.println();
		}
		
	
	}
	
	private static void executeConstructor() throws NoSuchMethodException, SecurityException {
		System.out.println("--- Construtor ---");
		System.out.println("");
		
		/**construtor vazio **/
		
		Class tabela1 = Tabela.class;
		Constructor con = tabela1.getConstructor();
		System.out.println("Constructor (vazio) da class tabela: con: " + con);
		System.out.println("");
	}
	

}