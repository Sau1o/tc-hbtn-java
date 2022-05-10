import java.util.*;

public class ListaTelefonica {
    public HashMap<String, HashSet<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> listaTelefones = telefones.get(nome);

        if (listaTelefones == null) {
            listaTelefones = new HashSet<>();
        }
     
        if (listaTelefones.contains(telefone))
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");


        for(String nomePessoa : telefones.keySet()) {
            if (nomePessoa == nome)
                continue;
            
            if (telefones.get(nomePessoa).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }
        
        listaTelefones.add(telefone);

        telefones.put(nome, listaTelefones);
    }

    public HashSet<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }
}
