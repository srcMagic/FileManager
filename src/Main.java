public class Main {

    public static void main(String[] args) {

        String basePath = "C:\\Users\\Lorenzo\\Desktop\\file_java/";
        String nomeFile = basePath + "test.txt";
        String file2 = basePath + "copiaDaTest.txt";
        String contenuto = "Questa è una prova ";

        FileManager fileManager = new FileManager();

        fileManager.scriviSuFile(nomeFile, contenuto);

        fileManager.leggiDaFile(nomeFile);

        fileManager.copiaDaFile(nomeFile, file2);

        fileManager.eliminaFile(nomeFile);
    }
}