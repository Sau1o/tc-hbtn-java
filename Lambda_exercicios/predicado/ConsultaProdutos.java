import java.util.*;
import java.util.function.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criteriofFiltro) {
        ArrayList<Produto> filtrados = new ArrayList<Produto>();
        for(Produto p : produtos) {
            if (criteriofFiltro.test(p)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}
