package com.fiap.loja;

import java.util.HashMap;
import java.util.Map;

import com.fiap.loja.beans.ProdutoTO;

public class EstoqueBO {
	
	//Simula o banco de dados
	private Map<Integer,ProdutoTO> banco;

	public EstoqueBO(){
		banco = new HashMap<>();
		banco.put(401,new ProdutoTO(401,"Camiseta Masculina Manga Curta Branca",35.59,150));
		banco.put(402, new ProdutoTO(402,"Camiseta Feminina Manga Longa Rosa",32.59,110));
	}
	
	public ProdutoTO consultarProduto (int codigo){

		return banco.get(codigo);
	}
	
}
