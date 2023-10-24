package shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

// Cosa fare?la classe Prodotto che gestisce i prodotti dello shop.
// Un prodotto è caratterizzato da:
// codice (numero intero)
// nome
// descrizione
// prezzo
// iva
// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
// il codice prodotto sia accessibile solo in lettura
// gli altri attributi siano accessibili sia in lettura che in scrittura
// il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
// Lo shop gestisce diversi tipi di prodotto:
// SPhone caratterizzati anche dal codice IMEI e dalla quantità di memoria
// Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
// Cuffie, caratterizzate dal colore e se sono wireless o cablate
// Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sottotipi di prodotto.
// Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
// Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno sPhone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
// Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe) e il totale calcolato:
// BONUS_  Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%. Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%. Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%. Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%. Nella classe carrello chiedere all’utente se possiede una carta fedeltà In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.

public class Prodotto {
        private final int codice;
        private String  nome;
        private String  descrizione;
        private double prezzo;
        private double iva;


    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getPrezzoConIva() {
        return prezzo + (prezzo +iva / 100);
    }
    public String getNomeEsteso() {
        return String.format("%08d-%s", codice, nome);
    }
    public int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100000000);
    }
    public double calcolaPrezzoScontato(boolean haTesseraFedelta) {
        double sconto = haTesseraFedelta ? 0.02 : 0.0;
        return prezzo - (prezzo * sconto);
    }
}

class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }
}
class Televisione extends Prodotto {
    private int dimenzione;
    private boolean isSmart;

    public Televisione(String nome, String descrizione, double prezzo, double iva, int dimenzione, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimenzione = dimenzione;
        this.isSmart = isSmart;
    }
}




















