import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerializarEstudantes {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(nomeArquivo));
            objectOutputStream.writeObject(estudantes);
            objectOutputStream.close();
        } catch (Exception ex) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        ObjectInputStream objectInputStream;
        List<Estudante> estudantes = null;
        
        try {
            objectInputStream = new ObjectInputStream(
                new FileInputStream(nomeArquivo));
            estudantes = (List<Estudante>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception ex) {
            System.out.println("Nao foi possivel desserializar");
        }

        return estudantes;
    }
}
