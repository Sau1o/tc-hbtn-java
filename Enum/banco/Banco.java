import java.util.ArrayList;

public class Banco {

	private String nome;
	private ArrayList<Agencia> agencias;

	public Banco(String nome) {
		this.nome = nome;
		this.agencias = new ArrayList<>();
	}

	public boolean adicionarAgencia(String nome) {
		if (buscarAgencia(nome) == null) {
			Agencia novaAgencia = new Agencia(nome);
			agencias.add(novaAgencia);
			return true;
		}

		return false;
	}

	public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial) {
		Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

		if (agenciaEncontrada == null) {
			return false;
		}

		return agenciaEncontrada.novoCliente(nomeCliente, transacaoInicial);
	}

	public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao) {
		Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);
		if (agenciaEncontrada == null) {
			return false;
		}

		return agenciaEncontrada.adicionarTransacaoCliente(nomeCliente, transacao);
	}

	private Agencia buscarAgencia(String nome) {
		for (int i = 0; i < agencias.size(); i++) {
			if (agencias.get(i).getName().equals(nome)) {
				return agencias.get(i);
			}
		}
		return null;
	}

	public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
		Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

		if (agenciaEncontrada == null) {
			return false;
		}

		for (int i = 0; i < agenciaEncontrada.getClientes().size(); i++) {
			Cliente clienteEncontrado = agenciaEncontrada.getClientes().get(i);
			System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (i + 1) + "]");

            if (imprimirTransacoes) {
				for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
					System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
				}
			}

		}

        return true;
	}
}
