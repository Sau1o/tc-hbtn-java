public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public boolean getEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void modificarDescricao(String descricao) {
        if (descricao == null || descricao == "") {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }

        this.descricao = descricao;
    }
}
