
import java.util.Scanner;


public class Cashier {

    private int balance;
    
    public Cashier()
    {
       balance = 0;    
    }
    
    public void addMoney(int amount)
    {
        balance += amount;
    }
    
    
    public Boolean compareBalance(Product Product)
    {
        if(balance >= Product.getPrice())
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
    
    public void clearBalance()
    {
        balance = 0;
    }
    
    public int makeChange(int amount)
    {
        return balance - amount;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public int setBalance(int amount)
    {
        balance = amount;
        return balance;
    } 
}
