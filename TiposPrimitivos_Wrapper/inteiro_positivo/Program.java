public class Program {
    public static void main(String[] args) {
        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo("1");
            System.out.println(InteiroPositivo.getValor() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        InteiroPositivo InteiroPositivo1 = null;

        try {
            InteiroPositivo1 = new InteiroPositivo("43");
            System.out.println(InteiroPositivo1.getValor() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo1.setValor(-1);
            System.out.println(InteiroPositivo1.getValor() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo1.setValor(InteiroPositivo1.getValor() + 1);
            System.out.println(InteiroPositivo1.getValor() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo("-3");
            System.out.println(InteiroPositivo.getValor() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo(379);
            System.out.println(InteiroPositivo.getValor() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo(378);
            System.out.println(InteiroPositivo.getValor() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
