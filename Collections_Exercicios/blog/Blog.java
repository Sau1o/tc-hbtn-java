import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        
        for(Post p : posts) {
            autores.add(p.getAutor());
        }

        return autores; 
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemPorCategoria = new TreeMap<>();

        int contagemAtual;

        for(Post p : posts) {
            if (contagemPorCategoria.containsKey(p.getCategoria())) {
                contagemAtual = contagemPorCategoria.get(p.getCategoria());
            } else {
                contagemAtual = 0;
            }

            contagemPorCategoria.put(p.getCategoria(), contagemAtual + 1);
        }

        return contagemPorCategoria;        
    }
}