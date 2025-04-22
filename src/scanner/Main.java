package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GestoreDocumentiImpl gestoreDocumenti = new GestoreDocumentiImpl();

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. INSERISCI UN NUOVO DOCUMENTO");
            System.out.println("2. CERCA DOCUMENTO PER TITOLO");
            System.out.println("3. ELIMINA UN DOCUMENTO");
            System.out.println("4. STAMPA ELENCO DOCUMENTI");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    gestoreDocumenti.inserisciDocumento();
                    break;
                case 2:
                    gestoreDocumenti.cercaLibro();
                    break;
                case 3:
                    gestoreDocumenti.eliminaDocumento();
                    break;
                case 4:
                    gestoreDocumenti.stampaElencoDocumenti();
                    break;
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

            System.out.println();

        } while (scelta != 0);

        scanner.close();
    }
}

