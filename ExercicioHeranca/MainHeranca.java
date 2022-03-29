public class MainHeranca {
    public static void main(String[] args) {
        ProfessorExclusiva paulo = new ProfessorExclusiva("paulo", "123", 34);
        paulo.salario();
        System.out.println(paulo.getSalario());

        ProfessorHorista ana = new ProfessorHorista("ana", "345", 50);
        ana.salario();
        System.out.println(ana.getSalario());
    }
}