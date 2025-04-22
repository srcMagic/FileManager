package scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GestoreDocumentiImpl implements GestoreDocumenti {

    Scanner scanner = new Scanner(System.in);

    private List<Documento> listaDocumenti = new ArrayList<>();

    @Override
    public void inserisciDocumento() {
        System.out.println("Inserisci titolo ");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci autore ");
        String autore = scanner.nextLine();

        int numPagine = 0;
        do {
            try {
                System.out.println("Inserisci un numero di pagine: ");
                numPagine = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Inserimento non valido, Inserisci un numero ");
            }
            scanner.nextLine();
        } while (numPagine <= 0);
        System.out.println("Numero pagine inserito correttamente ");

        System.out.println("Inserisci contenuto ");
        String contenuto = scanner.nextLine();

        Documento doc = new Documento(titolo, autore, numPagine, contenuto);
        listaDocumenti.add(doc);
        System.out.println("Documento aggiunto con successo !");

    }

    @Override
    public void cercaLibro() {
        System.out.println("Inserisci il titolo da cercare : ");
        String titolo = scanner.nextLine();
        if (listaDocumenti.isEmpty()) {
            System.out.println("Impossibile cercare documenti lista vuota!");
        }
        for (Documento doc : listaDocumenti) {
            if (doc.getTitolo().equalsIgnoreCase(titolo)) {
                System.out.println("Contenuto del docuemnto: " + doc.getContenuto());
            }
        }
    }

    @Override
    public void eliminaDocumento() {
        System.out.println("Inserisci il titolo di un libro da eliminare : ");
        String titolo = scanner.nextLine();
        if (listaDocumenti.isEmpty()) {
            System.out.println("Impossibile eliminare documento, Lista vuota!");
        } else {
            listaDocumenti.removeIf(documento -> documento.getTitolo().equalsIgnoreCase(titolo));
            System.out.println("Documento eliminato con successo !");
        }
    }

    @Override
    public void stampaElencoDocumenti() {
        if (listaDocumenti.isEmpty()) {
            System.out.println("Nessun documento presente nella lista");
        } else {
            listaDocumenti.forEach(System.out::println);
        }
    }
}