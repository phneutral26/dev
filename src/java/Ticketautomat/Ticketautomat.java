public class Ticketautomat
{
    private int preis; // Der Ticketpreis
    private int bisherGezahlt; // bisher gezahlter Betrag
    
    /**
     * Konstruktor vom Ticketautomaten
     */
    public Ticketautomat(int pTicketpreis)
    {
        preis = pTicketpreis;
        bisherGezahlt = 0;
    }
    
    public Ticketautomat() // Aufgabe 2
    {
        preis = 500;
        bisherGezahlt = 0;
    }
    
    /**
     * Liefert den Preis eines Tickets dieses Automaten (in Cent)
     */
    public int gibPreis()
    {
        return preis;
    }
    
    /**
     * Liefert den bisher eingezahlten Beitrag
     */
    public int gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }
    
    /**
     * Liefert den fehlenden Betrag
     */
    public int gibFehlendenBetrag() 
    {
        return preis - bisherGezahlt;
    }

    /**
     * Liefert den Rückgeld-Betrag zurück
     */
    public int gibRueckgeld()
    {
        return bisherGezahlt - preis;
    }

    /**
     * Es wird Geld in den automaten geworfen
     */
    public void geldEinwerfen(int pBetrag) 
    {
        bisherGezahlt += pBetrag;
    }
    
    /**
     * Kauf wird abgebrochen
     */
    public int kaufAbbrechen() {
        int hRueckgeld = bisherGezahlt;
        bisherGezahlt = 0;
        return hRueckgeld;
    }

    /**
     * Gibt eine Meldung aus
     */
    public void meldung() {
        System.out.println("Bitte werfen Sie den \t passenden Geldbetrag ein!");
        // \n -> Neue Zeile; \t -> Lücke
    }

    /**
     * Gibt den Preis au
     */
    public void preisAusgeben(){
        System.out.println("Der Preis eines Tickets beträgt" + preis + "Cent"); // + preis + "Cent"
    }

    /* public int muenzetest(int pWert) {
        if (bisherGezahlt % pWert >= 0) {
            int hAnzahl = (bisherGezahlt - (bisherGezahlt % pWert)) / pWert;
            bisherGezahlt = bisherGezahlt - (hAnzahl * pWert);
            return hAnzahl;
        } else {
            return 0;
        }  
    } */
    public int muenze(int pWert){
        int hAnzahl = (bisherGezahlt -(bisherGezahlt%pWert)) / pWert;
        bisherGezahlt = bisherGezahlt - (hAnzahl*pWert);
        return hAnzahl;
    }

    public void muenzen2() {
        System.out.println(bisherGezahlt);
        System.out.println(muenze(200) + " x 2 € ");
        System.out.println(muenze(100) + " x 1 € ");
        System.out.println(muenze(50) + " x 0.50 € ");
        System.out.println(muenze(20) + " x 0.20 € ");
        System.out.println(muenze(10) + " x 0.10 € ");
        System.out.println(muenze(5) + " x 0.05 € ");
        System.out.println(muenze(2) + " x 0.02 € ");
        System.out.println(muenze(1) + " x 0.01 € ");
    }
    /**
     * Druckt ein Ticket.
     */
    public void ticketDrucken()
    {
        if (bisherGezahlt >= preis) {  // Man darf nur ein Ticket bekommen, wenn man auch genug Geid eingezahlt hat.
            int rueckgeld = bisherGezahlt - preis;  // Rueckgeld wird berechnet
            // Den Ausdruck eines Tickets simulieren.
           // bisherGezahlt = 0;  // bisherGezahlt wird genullt, weil nun der Druck des Tickets erfolgt und der nächste Kauf abgeschlossen werden kann
            System.out.println("##################");
            System.out.println("# Ticket");
            System.out.println("# " + preis + " Cent.");
            System.out.println("# " + rueckgeld + " Cent.");
            System.out.println("##################");
            System.out.println();
            muenzen2();
        } else {
            int fehlenderBetrag = preis - bisherGezahlt;  // fehlender Betrag wird berechnet
            System.out.println("Dir fehlen " + fehlenderBetrag + " Cent.");  // Konsolenausgabe, die Auskunft über fehlenden Betrag gibt
        }
    } 
    public void main(){
        geldEinwerfen(200);
        ticketDrucken();
    }
}