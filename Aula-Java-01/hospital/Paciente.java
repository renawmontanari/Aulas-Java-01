
package hospital;

class Paciente {
    
    public String nome;
    public String tipoEnfermidade;
    
    public Paciente(String nome, String tipoEnfermidade) {
        this.nome = nome;
        this.tipoEnfermidade = tipoEnfermidade;
    }
    
    public void alterarEnfermidade(String tipoEnfermidade) {
        this.tipoEnfermidade = tipoEnfermidade;
    }
    
    public String relatorioPaciente() {
        return "individuo " + nome + " doenca " + tipoEnfermidade + "\n";
    }
}


