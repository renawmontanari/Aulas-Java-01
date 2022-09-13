package loja;

public class Produto {

	public String nome;
	public String fabricante;
	public double valor;
	
	public String exibirProduto() {
		return "Nome " + nome + " fabricante " + fabricante + " valor " + valor;
	}
}
