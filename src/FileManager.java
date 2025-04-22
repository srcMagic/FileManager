import java.io.*;

public class FileManager {

    // Scrive il contenuto in un file usando BufferedWriter
    public void scriviSuFile(String nomeFile, String contenuto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeFile))) {
            bufferedWriter.write(contenuto);
            System.out.println("File scritto con successo ");
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file " + e.getMessage());
        }
    }

    // Legge il contenuto di un file usando BufferedReader
    public void leggiDaFile(String nomeFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("File letto con successo");
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file " + e.getMessage());
        }
    }

    // Copia un file usando BufferedInputStream e BufferedOutputStream
    public void copiaDaFile(String sorgente, String destinazione) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sorgente));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinazione))) {

            byte[] buffer = new byte[1024];
            int byteRead;

            while ((byteRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, byteRead);
            }
            System.out.println("Copia completata con successo ");

        } catch (IOException e) {
            System.out.println("Errore nella copia del file  ");
        }
    }

    // Elimina un file usando la classe File
    public void eliminaFile(String nomeFile) {
        File file = new File(nomeFile);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File eliminato con successo ! " + file.getName());
            }
        } else {
            System.out.println("Impossibile eliminare il file " + file.getName());
        }
    }

    //Non utilizzare questo metodo, usa leggiDaFile();
    @Deprecated
    public void stampaFile(String nomeFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("File letto con successo");
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file " + e.getMessage());
        }
    }
}