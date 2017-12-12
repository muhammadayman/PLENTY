import java.util.*;
//import java.util.ArrayList;
import java.util.Vector;//imports vector utility


public class StoreOwner extends User {
	 public Vector<Store> stores_;

   
    public StoreOwner() 
    {
   	 stores_=new Vector<Store>();
	
    }
    public StoreOwner(String name,String email,String pass , String add,Vector<Store> s) 
     {

    	UserName=name;
        Email=email;
        Password=pass;
        Address=add;
      	stores_=new Vector<Store>();
      	for(int i=0;i<s.size();i++)
      	{
      		stores_.add(s.get(i));
      	}
      	}
      	

     }
    	
    
    


    //public ArrayList<Store> stores_;








