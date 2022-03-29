public class GalinhaPolimorfo extends AnimalPolimorfo {
    @Override
    public void comunicar() {
        System.out.println("cocorico");
    }
    @Override
    public void movimentar() {
        System.out.println("Caminhando com 2 patas");
    }
    
}
