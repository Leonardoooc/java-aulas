public class MainPolimorfismo {
    public static void main(String[] args) {
        AnimalPolimorfo galinha = new GalinhaPolimorfo();
        galinha.comunicar();
        galinha.movimentar();

        AnimalPolimorfo cachorro = new CachorroPolimorfo();
        cachorro.comunicar();
        cachorro.movimentar();
    }
}
