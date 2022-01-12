
/**
 * Write a description of class buch here.
 *
 * @version 1.0
 * @author Phil
 */
public class buch
{
    private int seitenanzahl;
    private int anzahlAusleihen;
    private String titel;
    private String autor;
    private boolean verliehen;
    private String signatur;

    public buch(String titel, String autor, int seitenanzahl)
    {
        this.titel = titel;
        this.autor = autor;
        this.seitenanzahl = seitenanzahl;
        this.verliehen = false;
        this.signatur = "";
    }
    /**  
     * Liefert das Attribut des Buches zurück.
     * */ 
    public String gibTitel() {
        return titel;
    }
    public String gibAutor() {
        return autor;
    }
    public int gibSeitenzahl(){
        return seitenanzahl;
    }
    public void returnAll(String pAuswahl){
  	switch (pAuswahl){
		case 'titel':
			System.out.println("titel")
			break;
	}
    }

    public String getSignatur() { return signatur; }

    /**
     * Setze das Attribut des Buches auf den gegebenen Parameter.
     */
    public void setzeTitel(String titel){
        this.titel = titel;
    }
    public void setzeAuthor(String autor){ this.autor = autor; }
    public void setzeSeitenanzahl(int seitenanzahl) { this.seitenanzahl = seitenanzahl; }
    public void setzeSignatur(String signatur) {
        if (signatur.length() == 10){
            this.signatur = signatur;
        }
        else { System.out.println("Bitte neue Signatur eingeben."); }
    }

    public boolean istVerliehen() {
        return verliehen;
    }
    public void leiheAus(){
        if (!verliehen) {
            verliehen = true;
            anzahlAusleihen++;
        }
        else {
            System.out.println("Das Buch ist schon ausgeliehen!");
        }
    }
    public void gibZurück(){
        if (verliehen){
            verliehen = false;
        }
        else { System.out.println("Das Buch ist nicht ausgeliehen.");}
    }
    public void gibDetails(){
        System.out.println("Der Titel des Buches lautet: " + titel);
        System.out.println("Der Autor des Buches lautet: " + autor);
        System.out.println("Die Signatur des Buches ist: " + signatur);
        System.out.println("Das Buch hat " + seitenanzahl + " Seiten");
        System.out.println("Das Buch wurde " + anzahlAusleihen + " mal ausgeliehen");
        if(!istVerliehen()){
            System.out.println("Das Buch ist verfügbar");
        }
        else { System.out.println("Das Buch ist nicht verfügbar");}
    }
}
