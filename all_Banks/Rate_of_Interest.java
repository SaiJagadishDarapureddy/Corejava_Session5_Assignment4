package all_Banks;

public class Rate_of_Interest {

	public static void main(String[] args) {
		HDFC_BANK hdfc= new HDFC_BANK();
		SCB scb= new SCB();
		HSBC hsbc= new HSBC();
		
		System.out.println("HDFC BANK Rate of Interest: "+hdfc.getRateOfInterest()+ "%");
		System.out.println("************************************");
		System.out.println("STANDARD CHARTERED BANK Rate of Interest: "+scb.getRateOfInterest()+ "%");
		System.out.println("************************************");
		System.out.println("HSBC BANK Rate of Interest: "+hsbc.getRateOfInterest()+ "%"); 
		
	}
}
