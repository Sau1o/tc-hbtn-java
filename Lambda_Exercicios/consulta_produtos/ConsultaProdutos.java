import java.util.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criteriofFiltro) {
        ArrayList<Produto> filtrados = new ArrayList<Produto>();
        for(Produto p : produtos) {
            if (criteriofFiltro.testar(p)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}
