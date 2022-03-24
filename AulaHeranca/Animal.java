public abstract class Animal {
    public String nome;
    public String raca;
    
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {

    }

    public void caminhar() {
        System.out.println("Caminhando..");
    }

    public abstract void comer();
}
