public abstract class Professor {
    private String nome;
    private String matricula;
    private int idade;
    private float salario;

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Professor(String nome, String matricula, int idade, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.salario = salario;
    }
    public Professor(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }


    public abstract void salario();
}
