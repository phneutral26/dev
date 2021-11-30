
/**
 * Write a description of class Ticketautomat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticketautomat
{
    private int preis;
    private int bisherGezahlt;
    private int rest_betrag;
    private int money;
    private int Zurueck;

    /**
     * Konstruktor vom Ticketautomaten 
    */
    public Ticketautomat(int pstart_money)
    {
        preis = 500;
        bisherGezahlt = 0;
        money = pstart_money;
        rest_betrag = 500;
    }
    /**
     * Liefert den Preis eines Tickets dieses Automatens (in cent)
     */
    public int gibPreis()
    {
        return preis;
    }
    /** Liefert den bisher eingezahlten Betrag */
    public int gibbisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }
    /** es wird geld in den automaten geworfen" */
    public void geldEinwerfen(int pBetrag)
    {
        if (pBetrag<money){    
            money -= pBetrag;
            bisherGezahlt += pBetrag;
            rest_betrag-=pBetrag;
            if(bisherGezahlt > preis){
                Zurueck = bisherGezahlt - preis;
                money += Zurueck;
                System.out.println(Zurueck + " Zurück");
            }
        }
        else{
            System.out.println("You dont have enough money to do this. Sorry.");
        }
    }
    /** Druckt ein Drucktext */
    public void ticketDrucken()
    {    
        if(bisherGezahlt>=500){
            System.out.println("##################");
            System.out.println("#Ticket#");
            System.out.println(preis);
            System.out.println("##################");
        }
        else{
            System.out.println("You didnt pay enough! You still have to pay: ");
            System.out.println(rest_betrag);
        }
        }
    public int restBetrag(){
        rest_betrag = preis - bisherGezahlt;
        return rest_betrag;
    }
    public void geldAufladen(int pAufladen)
    {
        money += pAufladen;
    }
    public void main(int pMoney) {
       geldEinwerfen(pMoney);
       ticketDrucken();
    }
     
}
