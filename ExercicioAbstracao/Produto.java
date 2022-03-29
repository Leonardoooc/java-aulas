public abstract class Produto {

    private String nome;
    private float preco;
    private String autor;
    private int numerofaixas;
    private int duracao;

    public String getNome() {
        return this.nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getNumeroFaixas() {
        return this.numerofaixas;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNumeroFaixas(int numerofaixas) {
        this.numerofaixas = numerofaixas;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produto() {
    }

    public abstract void produto();
    
}
