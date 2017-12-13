import java.util.ArrayList;

public class BrandController {
	
	public static ArrayList<Brand> Brands; 			// load all Brands on the platform
	public static ArrayList<Brand> Brands_Sugg;		// load all Brands Suggestions
		
	
	public static Boolean CheckExist (Brand br, ArrayList<Brand> brs) {
		for(int i=0;i<brs.size();i++) {
			if(br.getID()==brs.get(i).getID())
				return true;
		}
		return false;
	}	
	public static Boolean AddBrand (Brand br){
		if(CheckExist(br, Brands)==false) {
			Brands.add(br);
			System.out.println("The Brand '"+br.getName()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The Brand '"+br.getName()+"' already exists on the platform");
		return false;
	}
	public static Boolean DeleteBrand (Brand br) {
		if(CheckExist(br, Brands)==true) {
			Brands.remove(br);
			System.out.println("The Brand "+br.getName()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The Brand '"+br.getName()+"' doesn't exists on the platform");
		return false;
	}
	public static Boolean RejectBrand (Brand br) {
		if(CheckExist(br, Brands_Sugg)==true) {
			Brands_Sugg.remove(br);
			System.out.println("The Brand Suggestion '"+br.getName()+"' has been Succesfully Rejcected");
			return true;
		}
		System.out.println("The Brand Suggestion '"+br.getName()+"' doesn't exists");
		return false;
	}
	public static Boolean ApproveBrand (Brand br) {
		if(CheckExist(br, Brands_Sugg)==true) {
			Brands_Sugg.remove(br);
			Brands.add(br);
			System.out.println("The Brand Suggestion '"+br.getName()+"' has been Succesfully Approved");
			return true;
		}
		System.out.println("The Brand Suggestion '"+br.getName()+"' doesn't exists");
		return false;
	}
	


}