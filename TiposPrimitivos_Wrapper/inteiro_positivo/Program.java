public class Program {
    public static void main(String[] args) {
        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo("1");
            System.out.println(InteiroPositivo.getValue() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        InteiroPositivo InteiroPositivo1 = null;

        try {
            InteiroPositivo1 = new InteiroPositivo("43");
            System.out.println(InteiroPositivo1.getValue() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo1.setValue(-1);
            System.out.println(InteiroPositivo1.getValue() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo1.setValue(InteiroPositivo1.getValue() + 1);
            System.out.println(InteiroPositivo1.getValue() + " - " + InteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo("-3");
            System.out.println(InteiroPositivo.getValue() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo(379);
            System.out.println(InteiroPositivo.getValue() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo InteiroPositivo = new InteiroPositivo(378);
            System.out.println(InteiroPositivo.getValue() + " - " + InteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
