/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesta;

public class Cesta {
    
    private Produto[] itens = new Produto[100];
	
    public void adicionarItem(Produto produto){
	
        for (int i = 0; i < itens.length; i++) {
            if(itens[i] == null){
                itens[i] = produto;
                break;
            }
        }	
    }
    
    public void exibeLista(){	
        for(Produto item : itens){
            if(item != null){
             item.imprimirEtiqueta();
            }
        }
        calcularTotal();
    }
    
    public void calcularTotal(){
        double total = 0;
        for(Produto item : itens){
            if(item != null){
                total += item.getPreco();
            }
        }
        System.out.println("O preço total dos itens é: " + total);
    }
}
