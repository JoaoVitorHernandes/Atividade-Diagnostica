public class Pagamento {
    private String nome;
    private int preco;
    public Pagamento(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }
}
