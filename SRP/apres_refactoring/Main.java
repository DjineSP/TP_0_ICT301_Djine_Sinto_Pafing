package SRP.apres_refactoring;

// Utilisation des classes refactorisées
public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");

        // Affichage
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);

        // Sauvegarde
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "livre.txt");

        // Logique métier
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
        logic.autreService(book);
    }
}
