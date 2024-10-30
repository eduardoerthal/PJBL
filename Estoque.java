import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private List<Produto> produtos;

public Estoque() {
    produto = new ArrayList<>();

    public void adicionarProduto (Produto produtos){
        produtos.add(produtos);
    }

    public void removerProduto (Produto produtos){
        produtos.remove(produtos);
    }

    public List<Produto> listarProdutos () {
        return produtos
    }
}
}
