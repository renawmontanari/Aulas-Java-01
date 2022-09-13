
package lojashop;

public class Produto {
    private String nome;
    private String marca;
    
    public Produto(String nome, String marca) {
        this.setNome(nome);
        this.setMarca(marca);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String relatorioProduto() {
        return "produto " + getNome() + " marca " + getMarca() + "\n";
    }
}
