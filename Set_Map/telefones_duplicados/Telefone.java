import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;
    
    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", this.codigoArea, this.numero);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(this.codigoArea, this.numero);
        int hash = 7;
        hash = 31 * hash + (codigoArea == null ? 0 : codigoArea.hashCode());
        hash = 31 * hash + (numero == null ? 0 : numero.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return (codigoArea.equals(telefone.codigoArea) 
          && numero.equals(telefone.numero));
    }    
}
