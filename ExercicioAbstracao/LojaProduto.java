public class LojaProduto {
    public static void main(String[] args) {
        ProdutoCD produtocd1 = new ProdutoCD();
        produtocd1.produto();
        ProdutoLivro produtolivro1 = new ProdutoLivro();
        produtolivro1.produto();
        ProdutoDVD produtodvd1 = new ProdutoDVD();
        produtodvd1.produto();
        ProdutoLivro produtolivro2 = new ProdutoLivro();
        produtolivro2.produto();
        ProdutoCD produtocd2 = new ProdutoCD();
        produtocd2.produto();

        System.out.println("Nome do Livro:" + produtolivro1.getNome());
        System.out.println("Preço do Livro:" + produtolivro1.getPreco());
        System.out.println("Autor do Livro:" + produtolivro1.getAutor());
    }
    
}
