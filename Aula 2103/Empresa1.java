import java.util.Date;

public class Empresa1 {
    private String nome;
    private String cnpj;
    private String endereco;
    private Date dataFundacao;
    private float faturamento;

    public String getNome() {
        return this.nome;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public Date getDataFundacao() {
        return this.dataFundacao;
    }
    public float getFaturamento() {
        return this.faturamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public void showContents() {
        System.out.println(getNome());
        System.out.println(getCnpj());
        System.out.println(getEndereco());
        System.out.println(getDataFundacao());
        System.out.println(getFaturamento());
    }

}
