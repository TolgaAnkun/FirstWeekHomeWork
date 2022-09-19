package firstWeekHomeWork;

public class asalSayıProje {

	public static void main(String[] args) {
		
		int number = 5 ;
		
		int remainder = number % 2 ;
		
    	System.out.println(remainder);
		
						
		if (number==1) {
			
			System.out.println("Geçersiz sayı");
			return;
		}
		
				
		if (number<2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		boolean isPrime = true;
				
	  for (int i=2 ; i<number; i++) {
		  
		  if (number % i == 0) {
			  isPrime=false;
			 			  
		  }
		 
		  
		  if(isPrime) {
			  
			  System.out.println( "Asal Sayıdır.");
		  }
		  
		  else {
			  System.out.println( "Asal sayı değildir.");
		  }
		  return;
		  
		  
		  
	  }
	}

}
