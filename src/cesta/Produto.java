/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesta;

public class Produto {
 
        private int codProd;
	private String descricao;
	private double preco;
	private Fornecedor fornecedor;
	
	public int getCodProd(){
		return codProd;
	}
	
	public void setCodProd(int codProd){
		this.codProd = codProd;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescicao(String descricao){
		this.descricao = descricao;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public Fornecedor getFornecedor(){
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor){
		this.fornecedor = fornecedor;
	}
	
	public void imprimirEtiqueta(){
            System.out.println("\nCódigo do Produto: " + codProd +
				"\nDescrição: " + descricao +
				"\nPreço: " + preco +
				"\nFornecedor: " + fornecedor.getNome());
	}
}
