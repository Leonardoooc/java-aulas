import java.util.Scanner;

public class ProfessorHorista extends Professor {
    public ProfessorHorista(String nome, String matricula, int idade, float salario) {
        super(nome, matricula, idade, salario);
    }
    public ProfessorHorista(String nome, String matricula, int idade) {
        super(nome, matricula, idade);
    }
    public void salario() {
        System.out.println("Digite o valor por hora do salario do professor");
        Scanner scanvalorhora = new Scanner(System.in);
        float valorhora = scanvalorhora.nextFloat();

        System.out.println("Digite o numero de horas trabalhadas");
        Scanner scanhoras = new Scanner(System.in);
        float horas = scanhoras.nextFloat();

        float salario = horas*valorhora;
        setSalario(salario);
        
    }
    
}
