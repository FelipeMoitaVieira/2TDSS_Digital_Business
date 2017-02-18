package com.fiap.config;

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
			prop = new Properties();
			log.info("Instanciando o Properties");
			try{
			prop.load(PropertySingleton.class.getResourceAsStream("/loja.properties"));
			log.info("Carregando Propiedades");
			} catch(IOException e){
				log.error("Você perdeu, Playboy!! Desliga!!");
				e.printStackTrace();
			}
		}
		return prop;
	}
	
}
