import java.util.Scanner;

public class ProdutoLivro extends Produto {
    public ProdutoLivro(String nome, float preco) {
        super(nome, preco);
    }
    public ProdutoLivro() {
    }
    public void produto() {
        System.out.println("Digite o nome do Livro: ");
        Scanner scannome = new Scanner(System.in);
        String nome = scannome.nextLine();

        System.out.println("Digite o preço do Livro: ");
        Scanner scanpreco = new Scanner(System.in);
        float preco = scanpreco.nextFloat();

        System.out.println("Digite o autor do Livro: ");
        Scanner scanautor = new Scanner(System.in);
        String autor = scanautor.nextLine();

        setAutor(autor);
        setNome(nome);
        setPreco(preco);
    }
    
}
