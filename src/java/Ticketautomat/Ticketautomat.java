
/**
 * Write a description of class Ticketautomat here.
 *
 * @author (Phil)
 * @version (12/2021)
 */
public class Ticketautomat
{
    private int price; // how much is the ticket?
    private int bisherGezahlt; // how much have i payed by now?
    private int nochZuZahlen; // how much do i still need to pay?
    private int Geld; // how much Geld do i still have
    private int rückGeld; // how much exchange Geld do i get?
    private int alleEinahmen; // how much Geld has been put into the machine?

    /**
     * Konstruktor vom Ticketautomaten 
    */
    public Ticketautomat(int pstart_Geld)
    {
        price = 500;
        Geld = pstart_Geld;
        nochZuZahlen = 500;
    }
    /**
     * Liefert den price eines Tickets dieses Automatens (in cent)
     */
    public void gibprice()
    {
        System.out.println("The ticket is: " + price);
        
    }
    /** Liefert den bisher eingezahlten Betrag */
    public int givebisherGezahlt()
    {
        return bisherGezahlt;
    }
    /** es wird geld in den automaten geworfen" */
    public void pay(int pBetrag)
    {
         
        if (pBetrag<=Geld){ // Stops you from paying more than you have    
            Geld -= pBetrag; // adjust your balance to be reduced by payed Geld
            alleEinahmen += pBetrag; // update the variable to count every earning
            bisherGezahlt += pBetrag; // update the variable to count how many you have paid
            nochZuZahlen -= pBetrag; // reduce the variable, how much you still have to pay by payed Geld
            if(bisherGezahlt > price){ // Exchange Geld
                rückGeld = pBetrag - price;
                Geld += rückGeld;
                System.out.println(rückGeld + " Back");
                }
             else{
            System.out.println("You dont have enough Geld to do this. Sorry.");
        }
            }
        }
       
public int muenze(int pWert){
    if (bisherGezahlt % pWert >= 1){
        int hAnzahl = (bisherGezahlt - (bisherGezahlt % pWert)) / pWert;
        bisherGezahlt = bisherGezahlt - (hAnzahl * pWert);
        return hAnzahl;
    }
    else{
        return 0;
    }
}
public void muenze2(){
    System.out.println(muenze(200) + "x 2 €");
    System.out.println(muenze(100) + "x 1 €");
    System.out.println(muenze(50) + "x 0.5 €");
    System.out.println(muenze(20) + "x 0.5 €");
    System.out.println(muenze(10) + "x 0.1 €");
    System.out.println(muenze(5) + "x 0.05 €");
    System.out.println(muenze(2) + "x 0.02 €");
    System.out.println(muenze(1) + "x 0.01 €");
}
    
    /** Druckt ein Drucktext */
    public void printTicket()
    {    
        if(bisherGezahlt>=500){ // you need to pay exactly 500 cents
            System.out.println("##################");
            System.out.println("#Ticket#");
            System.out.println(price);
            System.out.println("##################");
            bisherGezahlt = 0;
            nochZuZahlen = 500;
        }
        else{
            System.out.println("You didnt pay enough! You still have to pay: ");
            System.out.println(nochZuZahlen); // look line 45
        }
        }
    public void stillLeft(){
        nochZuZahlen = price - bisherGezahlt; // UNNEEDED
        System.out.println("The price of the ticket still is: " + nochZuZahlen);
    }
    public void addGeld(int pAdd)
    {
        Geld += pAdd; //self-explanatory, create Geld from nothing an stuff it in your own pockets
    }
    public int returnalleEinahmen(){
        return alleEinahmen;
    }
    public void clear() {
        bisherGezahlt = 0;
        alleEinahmen = 0;
        nochZuZahlen = 500;
        Geld = 500;
    }
    public void setPrice(int pPrice) {
        price = pPrice;
        nochZuZahlen = 500;
        bisherGezahlt = 0;
    }
    public void meldung() {
        System.out.println("Bitte werfen sie den passenden\n\t Geldbetrag ein!");
    }    
}
