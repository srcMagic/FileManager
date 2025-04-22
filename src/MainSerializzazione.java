public class MainSerializzazione {

    public static void main(String[] args) {

        String basePath = "C:\\Users\\Lorenzo\\Desktop\\file_java/";
        String nomeFile = basePath + "doc.ser";

        Documento doc = new Documento("Sviluppo Software", "Lorenzo", "Java is the best programming lenguage");

        doc.salvaSuFile(nomeFile);

        doc.caricaDaFile(nomeFile);
    }
}
