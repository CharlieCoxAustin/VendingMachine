
import java.util.Scanner;


public class View {
    
    public void printMenu(Buffet Buffet)
    {
        System.out.println("Please Make a Selection: \n");
        for(int i = 1; i < 6; ++i)
        {
            Product product = Buffet.getProduct(i - 1);
            System.out.println((i) + ": " + product.getName() + ": " + product.getPrice());
            
        }
    }
    
    public void vendSuccess(Buffet Buffet, int location)
    {
        Product Product = Buffet.getProduct(location);
        System.out.println("Vend successful! Vending: " + Product.getName() + "\n");
        
    }
    
    public void vendFailureSoldOut()
    {
        System.out.println("SOLD OUT. \n");
    }
    
    public void vendFailureNoMoney(Cashier Cashier)
    {
        System.out.println("Insufficient funds! \n");
        System.out.println("Balance: " + Cashier.getBalance() + "\n");
    }
    
     public void getMoney(Cashier Cashier, Buffet Buffet)
    {
        int userInput = 6;
        
        while(userInput != 5)
        {
            System.out.println("Enter 1 for quarter, 2 for dime, 3 for nickel, 4 to vend, 5 to quit: \n");
            Scanner in = new Scanner(System.in);
            userInput = in.nextInt();
            
            if(userInput == 1)
            {
                Cashier.addMoney(25);
                System.out.println("Balance: " + Cashier.getBalance() + "\n");
            }
            else if(userInput == 2)
            {
                Cashier.addMoney(10);
                System.out.println("Balance: " + Cashier.getBalance() + "\n");
            }
            else if(userInput == 3)
            {
                Cashier.addMoney(5);
                System.out.println("Balance: " + Cashier.getBalance() + "\n");
            }
            else if(userInput == 4)
            {
                System.out.println("Choose a product: ");
                Scanner choiceIn = new Scanner(System.in);
                int choice = choiceIn.nextInt();
                --choice;
                Product productChoice = Buffet.getProduct(choice);
                if(Cashier.compareBalance(productChoice) == true && Buffet.inStock(choice))
                {
                    Buffet.vendProduct(choice);
                    this.vendSuccess(Buffet, choice);
                    Cashier.setBalance(Cashier.makeChange(productChoice.getPrice()));
                    System.out.println("Balance: " + Cashier.getBalance() + "\n");
                    //System.out.println("Change: " + );
                }
                else if(Cashier.compareBalance(productChoice) == false)
                {
                    this.vendFailureNoMoney(Cashier);
                    System.out.println("Balance: " + Cashier.getBalance() + "\n");
                            
                }
                else if(!Buffet.inStock(choice))
                {
                    this.vendFailureSoldOut();
                }
                
            }
            else if(userInput == 5)
            {
                System.out.println("Quitting. \n");
            }
            else
            {
                System.out.println("Invalid entry. Try again! \n");
            }
        }
    }
    
    
    
}
