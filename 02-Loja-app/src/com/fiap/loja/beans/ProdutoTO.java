package com.fiap.loja.beans;

import java.io.Serializable;

public class ProdutoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2448473594854188977L;
	
	
	private int codigo;
	private String descricao;
	private double preco;
	private int quantidade;
	
	public ProdutoTO(){}

	
	
	public ProdutoTO(int codigo, String descricao, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
