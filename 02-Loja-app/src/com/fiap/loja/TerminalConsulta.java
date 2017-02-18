package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.config.PropertySingleton;
import com.fiap.loja.beans.ProdutoTO;

public class TerminalConsulta {
	
	private static final Logger log = LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DecimalFormat moeda = new DecimalFormat("R$#,####.00");
		
		Scanner tc = new Scanner(System.in);
		
		String loja = PropertySingleton.getInstance().getProperty("nome");
		
		System.out.println(loja + " - " + formatador.format(Calendar.getInstance().getTime()));
		System.out.println("*****************************************************");
		
		System.out.println("Digite o código: ");
		int codigo = tc.nextInt();
		
		EstoqueBO bo = new EstoqueBO();
		ProdutoTO produto = bo.consultarProduto(codigo);
		log.info("Instanciando um objeto Produto");
		if(produto != null){
			log.info("Produto Existe no Sistema");
		System.out.println(produto.getDescricao());
		System.out.println(produto.getQuantidade());
		System.out.println(moeda.format(produto.getPreco()));
		}else{
			log.error("Produto não consta no sistema");
			System.out.println("Produto não cadastrado!!");
		}
		log.warn("Fim da Aplicação");
		tc.close();
		
	}

}
