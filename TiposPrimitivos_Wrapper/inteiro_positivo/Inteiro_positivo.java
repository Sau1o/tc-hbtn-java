public class InteiroPositivo {
    private int value

    public InteiroPositivo(int value) {
        setValue(value);
    }

    public InteiroPositivo(String value) {
        setValue(Integer.parseInt(value));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.value = value;
    }

    public boolean ehPrimo() {
        if (value < 2)
            return false;

        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0)
                return false;
        }

        return true;
    }
}
