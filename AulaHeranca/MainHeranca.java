public class MainHeranca {
    
    public static void main(String[] args) {

        Cachorro rex = new Cachorro("rex", "vira-lata");
        rex.caminhar();
        rex.latir();
        rex.comer();

        Gato garfield = new Gato("garfield");
        garfield.miar();
        garfield.caminhar();
        garfield.setRaca("qualquer");
    }
}
