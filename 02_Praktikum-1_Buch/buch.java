/**
 * Die Klasse Buch repraesentiert ein Buch und beinhaltet
 * Buchtitel, ISBN-Nummer (ISBN-13, z.B. 978-3868949070)
 * und den Lagerbestand.
 *
 * @author Marc Rennhard
 */
public class buch
{
    public String titel;
    private final String isbn;
    private int bestand;

    /**
     * Erzeugt ein Buch mit den spezifizierten Werten fuer
     * Titel und ISBN-Nummer und setzt den Bestand auf 0.
     *
     * @param buchTitel
     * @param buchISBN 
     */
    public buch(String buchTitel, String buchISBN)
    {
        titel = buchTitel;
        isbn = buchISBN;
    }

    /**
     * Get the stock.
     * 
     * @return numbers of books in the stock
     */
    public long getStock()
    {
        return bestand;
    }

    /**
     * Change the stock.
     * 
     * @param veraenderung
     * @return stock
     */
    public long changeStock(int veraenderung)
    {
        bestand = bestand + veraenderung;
        return bestand;
    }

    /**
     * Gibt die Informationen eines Buches aus.
     */
    public void output()
    {
        System.out.println("Titel: " + titel);
        System.out.println("ISBN-13: " + isbn);
        System.out.println("Bestand: " + bestand);
    }
}
