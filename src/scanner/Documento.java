package scanner;

public class Documento {

    private String titolo;
    private String autore;
    private int numPagine;
    private String contenuto;

    public Documento(String titolo, String autore, int numPagine, String contenuto) {
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
        this.contenuto = contenuto;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getContenuto() {
        return contenuto;
    }

    public int getNumPagine() {
        return numPagine;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numPagine=" + numPagine +
                ", contenuto='" + contenuto + '\'' +
                '}';
    }
}
