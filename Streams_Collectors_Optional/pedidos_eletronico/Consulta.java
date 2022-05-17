import java.util.*;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos()
                     .stream()
                     .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                     .toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                       .sorted(Comparator.comparing(Produto::getPreco).reversed())
                       .toList()
                       .get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos,
        double precoMinimo) {
        return produtos.stream()
                       .filter(p -> p.getPreco() >= precoMinimo)
                       .toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                      .filter(p -> p.getProdutos().stream()
                                                  .anyMatch(e -> e.getCategoria() == CategoriaProduto.ELETRONICO))
                      .toList();
    }
}
