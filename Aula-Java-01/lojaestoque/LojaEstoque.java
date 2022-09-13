
package lojaestoque;


public class LojaEstoque {
    public static void main(String[] args) {
       Estoque produtoUm = new Estoque("Teclado", "Dell", 20);
       System.out.println("Nome produto um: " + produtoUm.getNomeProduto());
       System.out.println("Marca produto um: " + produtoUm.getMarcaProduto());
       
       produtoUm.setMarcaProduto("Sony");
       produtoUm.setValorProduto(100);
       System.out.println("Marca alterada para " + produtoUm.getMarcaProduto());
    }
    
}
