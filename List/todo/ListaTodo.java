import java.util.*;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException(
                        String.format("Tarefa com identificador %d ja existente na lista", t.getIdentificador()));
            }
        }

        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean tarefaEncontrada = false;

        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(true);
                tarefaEncontrada = true;
            }
        }

        return tarefaEncontrada;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean tarefaEncontrada = false;

        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(false);
                tarefaEncontrada = true;
            }
        }

        return tarefaEncontrada;
    }

    public void fazerTodas() {
        for (Tarefa t : tarefas) {
            t.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa t : tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void listarTarefas() {
        for (Tarefa t : tarefas) {
            System.out.println(String.format("[%s]  Id: %d - Descricao: %s", t.getEstahFeita() ? "X" : " ",
                    t.getIdentificador(), t.getDescricao()));
        }
    }
}
