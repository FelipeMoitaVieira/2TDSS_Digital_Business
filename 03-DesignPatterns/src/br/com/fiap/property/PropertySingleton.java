package br.com.fiap.property;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PropertySingleton {

	private static final Logger log = LoggerFactory.getLogger(PropertySingleton.class);
	
	private static Properties prop;
	
	private PropertySingleton(){}
	
	public static Properties getInstance(){
		if(prop == null){
			
			log.info("Instanciando o Properties");
			
			prop = new Properties();
			
			try {
				log.info("Carregando as Propriedades");
				prop.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				log.error("Erro ao carregar as propriedades");
				e.printStackTrace();
			}
		}
		log.debug("Lendo uma propriedade do PropertySingleton");
		return prop;
	}
}
