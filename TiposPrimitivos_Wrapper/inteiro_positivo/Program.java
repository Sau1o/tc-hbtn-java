public class Program {
    public static void main(String[] args) {
        try {
            Inteiro_positivo Inteiro_positivo = new Inteiro_positivo("1");
            System.out.println(Inteiro_positivo.getValor() + " - " + Inteiro_positivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Inteiro_positivo Inteiro_positivo1 = null;

        try {
            Inteiro_positivo1 = new Inteiro_positivo("43");
            System.out.println(Inteiro_positivo1.getValor() + " - " + Inteiro_positivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Inteiro_positivo1.setValor(-1);
            System.out.println(Inteiro_positivo1.getValor() + " - " + Inteiro_positivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Inteiro_positivo1.setValor(Inteiro_positivo1.getValor() + 1);
            System.out.println(Inteiro_positivo1.getValor() + " - " + Inteiro_positivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Inteiro_positivo Inteiro_positivo = new Inteiro_positivo("-3");
            System.out.println(Inteiro_positivo.getValor() + " - " + Inteiro_positivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Inteiro_positivo Inteiro_positivo = new Inteiro_positivo(379);
            System.out.println(Inteiro_positivo.getValor() + " - " + Inteiro_positivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Inteiro_positivo Inteiro_positivo = new Inteiro_positivo(378);
            System.out.println(Inteiro_positivo.getValor() + " - " + Inteiro_positivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
