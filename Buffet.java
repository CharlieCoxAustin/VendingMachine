
public class Buffet {
    
    private Product [][] productArray;
    private int [] productCount = new int[5];
    
    public Buffet()
    {
        productArray = new Product[5][5];
        for(int i = 0; i < 5; ++i)
        {
            productCount[i] = 0;
        }
    }
    
    public Product getProduct(int location)
    { 
        return productArray[location][0];  
    }
    
    public void setProduct(int location, Product product)
    {
        productArray[location][productCount[location]] = product;
        ++productCount[location];
    }
    
    public Boolean vendProduct(int location)
    {
        if(productCount[location] > 0)
        {
           --productCount[location];
           return true;
        }
        else if(productCount[location] <= 0)
        {
            return false;
        }
        
        return false;
    }
    
    public void restock(int location, Product product)
    {
        while(productCount[location] < 5)
        {
            setProduct(location, product);
        }
    }
    
    public int getStock(int location)
    {
        return productCount[location];
    }
    
    public Boolean inStock(int location)
    {
        if(productCount[location] > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    
    
}
