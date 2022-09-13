
package lojashop;

import java.util.*;

public class LojaShop {

    public static void main(String[] args) {
        Scanner info = new Scanner( System.in );
        Produto produtoUm = new Produto("", "");
        
        System.out.println("Digite o nome do produto::");
        produtoUm.setNome(info.nextLine());
        System.out.println("Digite a marca do produto::");
        produtoUm.setMarca(info.nextLine());
        
        while(true) {
            Scanner entradaDados = new Scanner( System.in );
            System.out.println("Digite uma opcao do menu, sendo: \n [1] Relatorio \n [2] Alterar marca produto");
            
            int opcao = entradaDados.nextInt();
            
            if(opcao==1) {
                System.out.println("" + produtoUm.relatorioProduto());
            }
            else {
                if(opcao==2) {
                    System.out.println("Digite uma nova marca para o produto");
                    produtoUm.setMarca(info.nextLine());
                } else {
                    System.out.println("Fim");
                    break;
                }
            }
        }
    }    
}
