public class Gato extends Animal{
    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.println("miau miau");
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void comer() {
        System.out.println("Comendo..");
    }
    
}
