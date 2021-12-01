
/**
 * Write a description of class Ticketautomat here.
 *
 * @author (Phil)
 * @version (12/2021)
 */
public class Ticketautomat
{
    private int price; // how much is the ticket?
    private int payedByNow; // how much have i payed by now?
    private int still_left; // how much do i still need to pay?
    private int money; // how much money do i still have
    private int changeMoney; // how much exchange money do i get?
    private int allEarnings; // how much money has been put into the machine?

    /**
     * Konstruktor vom Ticketautomaten 
    */
    public Ticketautomat(int pstart_money)
    {
        price = 500;
        money = pstart_money;
        still_left = 500;
    }
    /**
     * Liefert den price eines Tickets dieses Automatens (in cent)
     */
    public int gibprice()
    {
        return price;
    }
    /** Liefert den bisher eingezahlten Betrag */
    public int givePayedByNow()
    {
        return payedByNow;
    }
    /** es wird geld in den automaten geworfen" */
    public void pay(int pAmount)
    {
         
        if (pAmount<=money){ // Stops you from paying more than you have    
            money -= pAmount; // adjust your balance to be reduced by payed money
            allEarnings += pAmount; // update the variable to count every earning
            payedByNow += pAmount; // update the variable to count how many you have paid
            still_left -= pAmount; // reduce the variable, how much you still have to pay by payed money
            if(payedByNow > price){ // Exchange Money
                changeMoney = pAmount - price;
                money += changeMoney;
                System.out.println(changeMoney + " Back");
            }
        }
        else{
            System.out.println("You dont have enough money to do this. Sorry.");
        }
    }
    /** Druckt ein Drucktext */
    public void printTicket()
    {    
        if(payedByNow>=500){ // you need to pay exactly 500 cents
            System.out.println("##################");
            System.out.println("#Ticket#");
            System.out.println(price);
            System.out.println("##################");
            payedByNow = 0;
            still_left = 500;
        }
        else{
            System.out.println("You didnt pay enough! You still have to pay: ");
            System.out.println(still_left); // look line 45
        }
        }
    public int stillLeft(){
        still_left = price - payedByNow; // UNNEEDED
        return still_left;
    }
    public void addMoney(int pAdd)
    {
        money += pAdd; //self-explanatory, create money from nothing an stuff it in your own pockets
    }
    public int returnAllEarnings(){
        return allEarnings;
    }
    public void clear() {
        payedByNow = 0;
        allEarnings = 0;
        still_left = 500;
        money = 500;
    }
    public void setPrice(int pPrice) {
        price = pPrice;
        still_left = 500;
        payedByNow = 0;
    }
    

}
