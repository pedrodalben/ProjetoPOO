/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesta;

import java.util.*;


public class GerenciarCompra {  
    
    private static void exibirFornecedores(Fornecedor[] fornecedores){
            for (int i = 0; i < fornecedores.length; i++) {
                if(fornecedores[i] != null){
                    fornecedores[i].imprimirFornecedor();
                }
            }
        }
    
    private static void exibirProdutos(Produto[] produtos){
            for (int i = 0; i < produtos.length; i++) {
                if(produtos[i] != null){
                    produtos[i].imprimirEtiqueta();
                }
            }
        }
    
    public static void main(String[] args) {
        
        Fornecedor fornecedor = new Fornecedor();
        Fornecedor fornecedores[] = new Fornecedor[100];
        Produto produto = new Produto();  
        Produto produtos[] = new Produto[100];
        Cesta cesta = new Cesta();
        Scanner s = new Scanner(System.in);
        String menu = "MENU \n"
                + "1 - Cadastrar Fornecedor\n"
                + "2 - Cadastrar Produto\n"
                + "3 - Abrir Carrinho\n"
                + "4 - Fechar Carrinho\n"
                + "9 - Sair\n"
                + "Digite a opção desejada: ";
        int opcao = 10;
        
        

        while(opcao != 9){

            System.out.print(menu);
            opcao = s.nextInt();
            
            switch(opcao){
            
                case 1:
                    System.out.print("Digite o nome do fornecedor: ");
                    fornecedor.setNome(s.next());
                    System.out.print("Digite o contato do fornecedor: ");
                    fornecedor.setContato(s.next());
                    System.out.print("Digite o fone do fornecedor: ");
                    fornecedor.setFone(s.next());
                    System.out.print("Digite o email do fornecedor: ");
                    fornecedor.setEmail(s.next());
                    for (int i = 0; i < fornecedores.length; i++) {
                        if(fornecedores[i] == null){
                            fornecedor.setIdForn(i);
                            fornecedores[i] = fornecedor;
                            System.out.println("Fornecedor Cadastrado com Sucesso!");
                            break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.print("Digite a descricao do produto: ");
                    produto.setDescicao(s.next());
                    System.out.print("Digite o preço do produto: ");
                    produto.setPreco(Double.parseDouble(s.next()));
                    if(fornecedores[0] != null){
                        exibirFornecedores(fornecedores);
                    } else {System.out.println("Não existem fornecedores cadastrados, cadastre ao menos um!");
                        break;
                    }                    
                    System.out.print("Digite o codigo do fornecedor que deseja associar a este produto: ");
                    int codigoFornecedor = s.nextInt();
                            produto.setFornecedor(fornecedores[codigoFornecedor]);
                    for (int i = 0; i < produtos.length; i++) {
                        if(produtos[i] == null){
                            produto.setCodProd(i);
                            produtos[i] = produto;
                            System.out.println("Produto Cadastrado com Sucesso!");
                            break;
                        }
                    }                    
                    break;
                    
                case 3:
                    exibirProdutos(produtos);
                    System.out.print("Digite o codigo do produto que você deseja inserir na cesta: ");
                    int codigoProduto = s.nextInt();
                    for (int i = 0; i < produtos.length; i++) {
                        if(produtos[i].getCodProd() == codigoProduto){
                            cesta.adicionarItem(produto);
                            System.out.println("Produto Adicionado na Cesta!");
                            break;
                        }                        
                    }
                    break;
                    
                case 4:
                    cesta.exibeLista();
                    //System.out.println("Volte Sempre!");
                    break;
                    
                case 9:
                    System.out.println("Compra cancelada!");
                    break;
                    
                default:
                    System.out.println("Opção incorreta, digita uma opção válida");
            }
        }
        
    }
    
}
