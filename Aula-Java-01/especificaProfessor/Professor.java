
package especificaprofessor;

public class Professor {
    private String nome;
    private int idade;
    private String cidade;
        
        public Professor(String nome, int idade, String cidade) {
            this.nome = nome;
            setIdadeProfessor(idade);
            this.cidade = cidade; 
        }
        
            public void setNomeProfessor(String nome) {
                this.nome = nome;
            }
            
            public void setIdadeProfessor(int idade) {
                if(idade > 18 && idade < 80) {   
                    this.idade = idade;
                } else {
                    this.idade = 0;
                  }
            }
            
            public void setCidadeProfessor(String cidade) {
                this.cidade = cidade;
            }
            
            public String getNomeProfessor() {
                return nome;
            }
            
            public int getIdadeProfessor() {
                return idade;
            }  
            
            public String getCidadeProfessor() {
                return cidade;
            }

}
