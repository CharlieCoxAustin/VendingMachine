
public class Main {
    
    public static void main(String[] args)
    {
        Buffet Buffet = new Buffet();
        View View = new View();
        Cashier Cashier = new Cashier();
        
        Product Cheetos = new Product("Cheetos", 75);
        Product ClifBar = new Product("Clif Bar", 100);
        Product Oreos = new Product("Oreos", 100);
        Product ReesesCups = new Product("Reeses Cups", 75);
        Product Doritos = new Product("Doritos", 75);
        
        Buffet.restock(0, Oreos);
        Buffet.restock(1, Cheetos);
        Buffet.restock(2, ClifBar);
        Buffet.restock(3, ReesesCups);
        Buffet.restock(4, Doritos);
        
        View.printMenu(Buffet);
        View.getMoney(Cashier, Buffet);
    }
    
}
