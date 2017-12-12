
import java.util.*;


public abstract class User {
	
	public User()
	{
	}

    
    protected String UserName;
    protected String Email;
    protected String Password;
    protected String Address;
    //public Cart user_cart;


    public void setEmail(String Email)
    {
        // TODO implement here
    	this.Email=Email;
       
    }

   
    public void setPassword(String pass) {
        this.Password=pass;
       
    }

    public String getEmail() 
    {
        
        return this.Email;
    }

  
    public String getAddress()
    {
        // TODO implement here
        return this.Address;
    }

   
    public String getPassword() 
    {
        // TODO implement here
        return this.Password;
    }

    
    public void setAddress(String Addr)
    {
        this.Address=Addr;
    }

}