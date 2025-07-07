package farmacialaila;

public class Produtos {
    int idProduto;
    String nome;
    String descricao;
    String fabricante;
    double preco;
    String dataValidade;

    public Produto(int idProduto, String nome, String descricao, String fabricante, double preco, String dataValidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
}
