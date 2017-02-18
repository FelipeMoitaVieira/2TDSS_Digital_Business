package br.com.fiap.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.property.PropertySingleton;

public class Teste {
	
	private static Logger log = LoggerFactory.getLogger(Teste.class);

	public static void main(String[] args) {
		//exibir uma propriedade
		
		log.debug("Lendo uma propriedade do sistema");
		
		System.out.println(PropertySingleton.getInstance().getProperty("repositorio"));
		/*System.out.println(PropertySingleton.getInstance().getProperty("url"));
		System.out.println(PropertySingleton.getInstance().getProperty("modo"));*/
		
	}

}
