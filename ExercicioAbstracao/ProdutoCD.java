import java.util.Scanner;

public class ProdutoCD extends Produto {
    public ProdutoCD(String nome, float preco) {
        super(nome, preco);
    }
    public ProdutoCD() {
    }
    public void produto() {
        System.out.println("Digite o nome do CD: ");
        Scanner scannome = new Scanner(System.in);
        String nome = scannome.nextLine();

        System.out.println("Digite o preço do CD: ");
        Scanner scanpreco = new Scanner(System.in);
        float preco = scanpreco.nextFloat();

        System.out.println("Digite o numero de faixas do CD: ");
        Scanner scanfaixas = new Scanner(System.in);
        int numerofaixas = scanfaixas.nextInt();

        setNumeroFaixas(numerofaixas);
        setNome(nome);
        setPreco(preco);
    }
}
