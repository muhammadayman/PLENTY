import java.util.ArrayList;

public class VoucherController {
	
	public static ArrayList<VoucherCard> VoucherCards; 			// load all VoucherCards on the platform
		
	
	public static Boolean CheckExist (VoucherCard vr, ArrayList<VoucherCard> vrs) {
		for(int i=0;i<vrs.size();i++) {
			if(vr.getVoucherCode()==vrs.get(i).getVoucherCode())
				return true;
		}
		return false;
	}	
	public static Boolean AddVoucherCard (VoucherCard vr){
		if(CheckExist(vr, VoucherCards)==false) {
			VoucherCards.add(vr);
			System.out.println("The VoucherCard '"+vr.getVoucherCode()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The VoucherCard '"+vr.getVoucherCode()+"' already exists on the platform");
		return false;
	}
	public static Boolean DeleteVoucherCard (VoucherCard vr) {
		if(CheckExist(vr, VoucherCards)==true) {
			VoucherCards.remove(vr);
			System.out.println("The VoucherCard "+vr.getVoucherCode()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The VoucherCards '"+vr.getVoucherCode()+"' doesn't exists on the platform");
		return false;
	}
	


}
