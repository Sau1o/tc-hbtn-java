import java.util.ArrayList;
import atividades.*;

public class Workflow {
    private ArrayList<Atividade> atividades;

    public Workflow() {
        atividades = new ArrayList<>();
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void RegistrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
}
