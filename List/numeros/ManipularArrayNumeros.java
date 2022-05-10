import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    } 

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        if (buscarPosicaoNumero(numeros, numero) != -1)
            throw new IllegalArgumentException("Numero jah contido na lista");

        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero) {
        int indice = buscarPosicaoNumero(numeros, numero);
        if (indice == -1)
            throw new IllegalArgumentException("Numero nao encontrado na lista");

        numeros.remove(indice);
    }    

    public static void substituirNumero(List<Integer> numeros,
        int numeroSubstituir, int numeroSubstituto) {
        int indice = buscarPosicaoNumero(numeros, numeroSubstituir);
        if (indice == -1)
            numeros.add(numeroSubstituto);
        else
            numeros.set(indice, numeroSubstituto);
    } 
}
