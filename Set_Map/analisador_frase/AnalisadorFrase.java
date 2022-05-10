import java.util.*;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> resultadoContagem = new TreeMap<>();

        String[] palavras = frase
                                .toLowerCase()
                                .replace("!", "")
                                .replace(".", "")
                                .replace("?", "")
                                .split(" ");

        for(String p : palavras) {
            if (resultadoContagem.containsKey(p)) {
                resultadoContagem.put(p, resultadoContagem.get(p) + 1);
            } else {
                resultadoContagem.put(p, 1);
            }
        }

        return resultadoContagem;
    }
}