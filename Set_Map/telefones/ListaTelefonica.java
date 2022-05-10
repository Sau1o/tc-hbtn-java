import java.util.*;

public class ListaTelefonica {
    public HashMap<String, ArrayList<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> listaTelefones = telefones.get(nome);

        if (listaTelefones == null) {
            listaTelefones = new ArrayList<>();
        }
     
        listaTelefones.add(telefone);

        telefones.put(nome, listaTelefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }
}
