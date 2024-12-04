import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Retangulo extends FormaGeometrica {
    private double altura;
    private double largura;

    // Formatter para usar ponto decimal
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");

        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0)
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");

        this.largura = largura;
    }

    public void exibirDimensoes() {
        System.out.println("Altura: " + df.format(altura));
        System.out.println("Largura: " + df.format(largura));
    }
}
