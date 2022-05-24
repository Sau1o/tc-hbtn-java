//import java.text.NumberFormat;
//import java.util.Locale;

public class Eletronico {
    private String descricao;
    private double valor;

//    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    
    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("[%s] R$ %f",
            getDescricao(), getValor());
    }
}
