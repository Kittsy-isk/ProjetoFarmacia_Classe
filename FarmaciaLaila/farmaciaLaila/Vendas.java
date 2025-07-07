package farmacialaila;

public class Vendas {
    int idVenda;
    int idProduto;
    int quantidadeVendida;
    double precoUnitario;
    String dataVenda;
    String nomeCliente;

    
    public Venda(int idVenda, int idProduto, int quantidadeVendida, double precoUnitario, String dataVenda, String nomeCliente) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidadeVendida = quantidadeVendida;
        this.precoUnitario = precoUnitario;
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
    }
}
