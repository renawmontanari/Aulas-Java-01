

package loja;

import java.util.Scanner;
public class Loja {
	
	public static void main(String[] args) {
		
		Produto produtoUm = new Produto();
		Scanner entradaDados = new Scanner( System.in );
		
		System.out.println("Digite o nome do produto:: ");
		produtoUm.nome = entradaDados.nextLine();
		
		System.out.println("Digite o fabricante do produto:: ");
		produtoUm.fabricante = entradaDados.nextLine();
		
		System.out.println("Digite o valor do produto:: ");
		produtoUm.valor = entradaDados.nextDouble();
		
		System.out.println("Dados do pronduto:: " + produtoUm.exibirProduto());
		
	}
	
}
