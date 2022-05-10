import java.util.ArrayList;

public class Agencia {

	private String name;
	private ArrayList<Cliente> clientes;

	public Agencia(String nome) {
		this.name = nome;
		this.clientes = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public boolean novoCliente(String nome, double transacaoInicial) {
		Cliente clienteEncontrado = buscarCliente(nome);

		if (clienteEncontrado != null) {
			return false;
		}

		Cliente novoCliente = new Cliente(nome, transacaoInicial);
		clientes.add(novoCliente);

        return true;
	}

	public boolean adicionarTransacaoCliente(String nome, double transacao) {
		Cliente clienteEncontrado = buscarCliente(nome);

		if (clienteEncontrado == null) {
			return false;
		}

		clienteEncontrado.adicionarTransacao(transacao);
        
		return true;
	}

	private Cliente buscarCliente(String nome) {
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getNome().equals(nome)) {
				return clientes.get(i);
			}
		}

		return null;
	}
}