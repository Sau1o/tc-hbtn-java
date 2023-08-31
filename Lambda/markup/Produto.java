import java.util.function.*;

public class Produto {
    private double preco
    private String nome;
    
    private double percentualMarkUp = 10;

    public Supplier<Double> precoComMarkUp = () -> this.getPreco() * (1 + (this.percentualMarkUp / 100));

    public Consumer<Double> atualizarMarkUp = x -> this.percentualMarkUp = x;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
