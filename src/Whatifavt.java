import java.util.Scanner;
public class Whatifavt {

	public static void main(String[] args) {
		String cusnum, name,tax_code;
		double total=0, sales_amount;

	    
		Scanner keyboard = new Scanner(System.in);
					
			System.out.print( "Custon number? :" );
			 cusnum = keyboard.next();
			 
			 System.out.print( "name? :" );
			 name = keyboard.next();
			 
			 System.out.print( "sales_amount? :" );
			 sales_amount = keyboard.nextDouble();
			 
			 System.out.print( "tax_code? :" );
			 tax_code = keyboard.next();
		
			 if( tax_code.equals("NRM") ){
				 total = sales_amount + sales_amount*.06;
				
			 }
			 else if ( tax_code.equals("NPF") ){
				 total = sales_amount;
				 
			 }
			 else if ( tax_code.equals("BIZ") ){
				 total = sales_amount+ sales_amount*.45;
				 
			 }System.out.println("Total" + total) ;
	}
	 

}
