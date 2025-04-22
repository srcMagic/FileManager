import java.io.*;

public class Documento implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String titolo;
    private String autore;
    private String contenuto;

    public Documento(String titolo, String autore, String contenuto) {
        this.titolo = titolo;
        this.autore = autore;
        this.contenuto = contenuto;
    }

    // Salva un oggetto Documento su file usando ObjectOutputStream
    public void salvaSuFile(String nomeFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(this);
            System.out.println("Oggetto Serializzato ");
        } catch (IOException e) {
            System.out.println("L'oggetto non puo essere serializzato " + e.getMessage());
        }
    }

    // Carica un Documento da file con ObjectInputStream
    public void caricaDaFile(String nomeFile) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFile))) {
            Documento doc = (Documento) ois.readObject();
            System.out.println("Oggetto deserializzato ");
            System.out.println(doc.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Impossibile deserializzare l'oggetto " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", contenuto='" + contenuto + '\'' +
                '}';
    }
}