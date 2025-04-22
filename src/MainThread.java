public class MainThread {

    public static void main(String[] args) {

        Downloader download1 = new Downloader("file1.txt");
        Downloader download2 = new Downloader("file2.txt");
        Downloader download3 = new Downloader("file3.txt");

        download1.start();
        download2.start();
        download3.start();

        try {
            download1.join();
            download2.join();
            download3.join();
            System.out.println("Tutti i download sono stati completati ");
        } catch (InterruptedException e) {
            System.out.println("Download interrotto ");
        }

    }
}
