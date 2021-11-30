
/**
 * Write a description of class Ticketautomat here.
 *
 * @author (Phil)
 * @version (12/2021)
 */
public class Ticketautomat
{
    private int preis; // how much is the ticket?
    private int bisherGezahlt; // how much have i payed by now?
    private int rest_betrag; // how much do i still need to pay?
    private int money; // how much money do i still have
    private int Zurueck; // how much exchange money do i get?

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
         
        if (pBetrag<=money){ // Stops you from paying more than you have    
            money -= pBetrag; // adjust your balance to be reduced by payed money
            bisherGezahlt += pBetrag; // update the variable to count how many you have paid
            rest_betrag-=pBetrag; // reduce the variable, how much you still have to pay by payed money
            if(bisherGezahlt > preis){ // Exchange Money
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
        if(bisherGezahlt>=500){ // yuo need to pay exactly 500 cents
            System.out.println("##################");
            System.out.println("#Ticket#");
            System.out.println(preis);
            System.out.println("##################");
        }
        else{
            System.out.println("You didnt pay enough! You still have to pay: ");
            System.out.println(rest_betrag); // look line 45
        }
        }
    public int restBetrag(){
        rest_betrag = preis - bisherGezahlt; // UNNEEDED
        return rest_betrag;
    }
    public void geldAufladen(int pAufladen)
    {
        money += pAufladen; //self-explanatory, create money from nothing an stuff it in your own pockets
    }
     
}
