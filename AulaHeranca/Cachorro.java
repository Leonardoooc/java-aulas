public class Cachorro extends Animal{
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println("au au");
    }

    public void comer() {
        System.out.println("Comendo..");
    }
    
}
