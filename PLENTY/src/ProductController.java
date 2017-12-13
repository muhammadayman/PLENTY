import java.util.ArrayList;

public class ProductController {
	
	public static ArrayList<Product> Products; 			// load all Products on the platform
	public static ArrayList<Product> Products_Sugg;		// load all Products Suggestions
		
	
	public static Boolean CheckExist (Product pr, ArrayList<Product> prs) {
		for(int i=0;i<prs.size();i++) {
			if(pr.getID()==prs.get(i).getID())
				return true;
		}
		return false;
	}	
	public static Boolean AddProduct (Product pr){
		if(CheckExist(pr, Products)==false) {
			Products.add(pr);
			System.out.println("The Product '"+pr.getName()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The Product '"+pr.getName()+"' already exists on the platform");
		return false;
	}
	public static Boolean DeleteProduct (Product pr) {
		if(CheckExist(pr, Products)==true) {
			Products.remove(pr);
			System.out.println("The Product "+pr.getName()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The Products '"+pr.getName()+"' doesn't exists on the platform");
		return false;
	}
	public static Boolean RejectProduct (Product pr) {
		if(CheckExist(pr, Products_Sugg)==true) {
			Products_Sugg.remove(pr);
			System.out.println("The Product Suggestion '"+pr.getName()+"' has been Succesfully Rejcected");
			return true;
		}
		System.out.println("The Product Suggestion '"+pr.getName()+"' doesn't exists");
		return false;
	}
	public static Boolean ApproveProduct (Product pr) {
		if(CheckExist(pr, Products_Sugg)==true) {
			Products_Sugg.remove(pr);
			Products.add(pr);
			System.out.println("The Product Suggestion '"+pr.getName()+"' has been Succesfully Approved");
			return true;
		}
		System.out.println("The Product Suggestion '"+pr.getName()+"' doesn't exists");
		return false;
	}
	
	


}