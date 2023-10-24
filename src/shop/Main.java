package shop;
// Nello stesso package aggiungete una classe Main con metodo main nella quale create tre prodotti e ne stampate il nome completo e il prezzo comprensivo di iva.
// BONUS: nella classe Prodotto create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Prodotto1 ", "Descrizione1", 10, 0.22);
        Prodotto prodotto2 = new Prodotto("Prodotto2 ", "Descrizione2", 20, 0.22);
        Prodotto prodotto3 = new Prodotto("Prodotto3 ", "Descrizione3", 30, 0.22);

        System.out.println("Prodotto 1: " + prodotto1.getNomeEsteso() + "Prezzo con Iva: " + prodotto1.getPrezzoConIva());
        System.out.println("Prodotto 2: " + prodotto2.getNomeEsteso() + "Prezzo con Iva: " + prodotto2.getPrezzoConIva());
        System.out.println("Prodotto 3: " + prodotto3.getNomeEsteso() + "Prezzo con Iva: " + prodotto3.getPrezzoConIva());
    }
}
