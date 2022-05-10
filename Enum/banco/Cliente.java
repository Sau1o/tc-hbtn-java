import java.util.ArrayList;

public class Cliente {

	private String name;
	private ArrayList<Double> transacoes;

	public Cliente(String nome, double transacaoInicial) {
		this.name = nome;
		this.transacoes = new ArrayList<>();
		adicionarTransacao(transacaoInicial);
	}

	public String getNome() {
		return name;
	}

	public ArrayList<Double> getTransacoes() {
		return transacoes;
	}

	public void adicionarTransacao(double transacao) {
		transacoes.add(transacao);
	}
}