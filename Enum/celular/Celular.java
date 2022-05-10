import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        int posicaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());

        if (posicaoContatoAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (contatoAntigo.getNome() != novoContato.getNome()
            && obterPosicaoContato(novoContato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        
        this.contatos.set(posicaoContatoAntigo, novoContato);
    }

    public void removerContato(Contato contato) {
        int posicaoContato = obterPosicaoContato(contato.getNome());
        if (posicaoContato == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        this.contatos.remove(posicaoContato);
    }

    private int obterPosicaoContato(String nome) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    public void listarContatos() {
        for (int i = 0; i < this.contatos.size(); i++) {
            System.out.println(this.contatos.get(i).getNome() + " -> " + this.contatos.get(i).getNumeroTelefone() + " (" + this.contatos.get(i).getTipoNumero() + ")");
        }
    }
}