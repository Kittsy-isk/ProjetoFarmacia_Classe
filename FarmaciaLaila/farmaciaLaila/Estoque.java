package farmacialaila;

public class Estoque {
    int idEstoque;
    int idProduto;
    int quantidadeAtual;
    String localArmazenamento;
    String dataEntrada;
    String dataUltimaSaida;

    public Estoque(int idEstoque, int idProduto, int quantidadeAtual, String localArmazenamento, String dataEntrada, String dataUltimaSaida) {
        this.idEstoque = idEstoque;
        this.idProduto = idProduto;
        this.quantidadeAtual = quantidadeAtual;
        this.localArmazenamento = localArmazenamento;
        this.dataEntrada = dataEntrada;
        this.dataUltimaSaida = dataUltimaSaida;
    }
}
