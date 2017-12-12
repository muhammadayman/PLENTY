import java.util.*;
//java.math.BigDecimal.multiply();

public class Cart {

    public Cart()
    {
    	 Products= new Vector<Product>();
         ProductQuantity =new Vector() ;

    }
    public Cart(int ID , Vector<Product>p, Vector<Integer> q)
    {
    	this.CartID=ID;
       
        for(int i=0 ;i<p.size();i++)
        {
          this.Products.add(p.get(i));
        }
        for(int i=0 ;i<q.size();i++)
        {
          this.ProductQuantity.add(q.get(i));
        }
       
    }

    private int CartID;
    public Vector<Product> Products;
    private double Price;
    public Vector <Integer>ProductQuantity ;

    
    public void setCardID(int cardid) 
    {
        this.CartID=cardid;
    }

   
    public double CalculatePrice() 
    {
    	float TotalPrice=0;
    	if(this.Products.size()==this.ProductQuantity.size())
    	{
            for(int i=0;i<this.Products.size();i++)
            {
            	TotalPrice+= Products.get(i).getPrice() *ProductQuantity.get(i);
            }

    	}
    	this.Price=TotalPrice;
    	return TotalPrice;
    }

    public int getCardID() {
        return this.CartID;
    }

}