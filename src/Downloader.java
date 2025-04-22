import java.io.FileWriter;
import java.io.IOException;

public class Downloader extends Thread {

    private String nomeFile;

    public Downloader(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    @Override
    public void run() {
        System.out.println("Avvio download del file. . .  " + nomeFile);
        try (FileWriter writer = new FileWriter(nomeFile)) {
            Thread.sleep(3000);
            writer.write("Download completato!");
            System.out.println("Download Completato");
        } catch (IOException | InterruptedException e) {
            System.out.println("Download interrotto per: " + e.getMessage());
        }
    }
}

