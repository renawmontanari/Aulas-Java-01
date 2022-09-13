
package especificaprofessor;

public class EspecificaProfessor {
    public static void main(String[] args) {
        Professor professorUm = new Professor("Rosangela",37 ,"Bauru");
            System.out.println("professor um: " + professorUm.getNomeProfessor());
            System.out.println("idade: " + professorUm.getIdadeProfessor());
            System.out.println("cidade: " + professorUm.getCidadeProfessor());
        
        Professor professorDois = new Professor("Pedro Antonio", 34, "Bauru");
            System.out.println("professor dois: " + professorDois.getNomeProfessor());
            System.out.println("idade: " + professorDois.getIdadeProfessor());
            System.out.println("cidade: " + professorDois.getCidadeProfessor());
        
        professorDois.setIdadeProfessor(30);
        professorDois.setCidadeProfessor("jau");
        
        System.out.println("idade alterada para o prof dois:  " + professorDois.getIdadeProfessor());
    }
}
