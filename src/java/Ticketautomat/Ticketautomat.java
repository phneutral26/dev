
/**
 * Write a description of class Ticketautomat here.
 *
 * @author (Phil)
 * @version (12/2021)
 */
public class Ticketautomat
{
    private double price; // how much is the ticket?
    private double payedByNow; // how much have i payed by now?
    private double still_left; // how much do i still need to pay?
    private double money; // how much money do i still have
    private double changeMoney; // how much exchange money do i get?
    private double allEarnings; // how much money has been put into the machine?

    /**
     * Konstruktor vom Ticketautomaten 
    */
    public Ticketautomat(int pstart_money)
    {
        price = 5.0;
        money = pstart_money;
        still_left = 5.0;
    }
    /**
     * Liefert den price eines Tickets dieses Automatens (in cent)
     */
    public void gibprice()
    {
        System.out.println("The ticket is: " + price);
        
    }
    /** Liefert den bisher eingezahlten Betrag */
    public double givePayedByNow()
    {
        return payedByNow;
    }
    /** es wird geld in den automaten geworfen" */
    public void pay(double pAmount)
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
                if (changeMoney >= 2.0){
                    double hchangeMoney = changeMoney;
                    double amount2Euro=changeMoney/2.0;
                    int test = (int)amount2Euro;
                    System.out.println("So much times 2.0 Euro Coins:" + test);
                    if(test*2.0!=changeMoney){
                        int testSubtract = test*2;
                        double DtestSubtract = (double) testSubtract;
                        hchangeMoney -= DtestSubtract ;
                        double amount1Euro=hchangeMoney/1.0;
                        int test2 = (int)amount1Euro;
                        System.out.println("So much times 1.0 euro coins:" + test2);
                    }
                }

            }
        }
        else{
            System.out.println("You dont have enough money to do this. Sorry.");
        }
    }
    /** Druckt ein Drucktext */
    public void printTicket()
    {    
        if(payedByNow>=5.0){ // you need to pay exactly 500 cents
            System.out.println("##################");
            System.out.println("#Ticket#");
            System.out.println(price);
            System.out.println("##################");
            payedByNow = 0.0;
            still_left = 5.0;
        }
        else{
            System.out.println("You didnt pay enough! You still have to pay: ");
            System.out.println(still_left); // look line 45
        }
        }
    public void stillLeft(){
        still_left = price - payedByNow; // UNNEEDED
        System.out.println("The price of the ticket still is: " + still_left);
    }
    public void addMoney(int pAdd)
    {
        money += pAdd; //self-explanatory, create money from nothing an stuff it in your own pockets
    }
    public double returnAllEarnings(){
        return allEarnings;
    }
    public void clear() {
        payedByNow = 0;
        allEarnings = 0;
        still_left = 5.0;
        money = 5.0;
    }
    public void setPrice(int pPrice) {
        price = pPrice;
        still_left = 5.0;
        payedByNow = 0.0;
    }
    public void meldung() {
        System.out.println("Bitte werfen sie den passenden\n\t Geldbetrag ein!");
    }    
}
