import java.util.Scanner;

public class ProfessorExclusiva extends Professor {
    public ProfessorExclusiva(String nome, String matricula, int idade, float salario) {
        super(nome, matricula, idade, salario);
    }
    public ProfessorExclusiva(String nome, String matricula, int idade) {
        super(nome, matricula, idade);
    }

    public void salario() {
        System.out.println("Digite o salario do professor");
        Scanner scansalario = new Scanner(System.in);
        float salario = scansalario.nextFloat();
        setSalario(salario);
    }
    
}
