public class Bibliothek
{
    String nameBibliothek;
    String standort; 
    
    buch buch1;
    buch buch2;
    buch buch3;
    buch buch4;
    buch buch5;
    /**
     * Konstruktor für Objekte der Klasse Bibliothek
     */
    public Bibliothek()
    {
        nameBibliothek = "Keplers Bibliothek";
        standort = "Ibbenbueren";
        
        buch1 = new buch("Eragon", "Christopher Paolini", 736);
        buch2 = new buch("Gregs Tagebuch", "Jeff Kinney", 224);
        buch3 = new buch("Harry Potter", "JK Rowling", 345);
        buch4 = new buch("Herr der Ringe", "Tolkien", 1000);
        buch5 = new buch("Informatik für Anfänger", "Informatiker", 50);

    }

    /**
     * Gibt die Details zu jedem Buch aus
     */
    public void gibDetailsAllerBuecher(int book)
    {
        switch (book) {
            case 0:
                buch1.gibDetails();
                buch2.gibDetails();
                buch3.gibDetails();
                buch4.gibDetails();
                buch5.gibDetails();
                break;
            case 1:
                buch1.gibDetails();
                break;
            case 2:
                buch2.gibDetails();
                break;
            case 3:
                buch3.gibDetails();
                break;
            case 4:
                buch4.gibDetails();
                break;
            case 5:
                buch5.gibDetails();
                break;
        }
    }
    
}