package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.nome = "MestreKame";
        professor.idade = 80;
        professor.sexo = 'H';

        System.out.println("O professor "+professor.nome+" tem "+professor.idade+" anos");
    }
}
