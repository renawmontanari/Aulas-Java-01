
package lojaestoque;

public class Estoque {
    private String nome;
    private String marca;
    private double valor;
    
        public Estoque(String nome, String marca, double valor) {
            this.nome = nome;
            setMarcaProduto(marca);
            this.valor = valor;
        }
        
            public void setNomeProduto(String nome) {
                this.nome = nome;
            }
            
            public void setMarcaProduto(String marca) {
                if(marca == "Oiiiiii") {
                    this.marca = marca;
                }
                 else {
                    System.out.println("Bla");
                 }
            }
            
            public void setValorProduto(double valor) {
                this.valor = valor;
            }
            
            
            public String  getNomeProduto() {
                return nome;
            }
            
            public String getMarcaProduto() {
                return marca;
            }
            
            public double getvalorProduto() {
                return valor;
            }  
}
