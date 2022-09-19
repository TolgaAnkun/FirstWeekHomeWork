package firstWeekHomeWork;

public class arrays {

	public static void main(String[] args) {
		
		String [] arabalar = new String [4];
		
		arabalar[0] = "Mercedes";
		arabalar[1] = "Toyota";
		arabalar[2] = "Renault";
		arabalar[3] = "Skoda";
		
		for(int i=0;i<arabalar.length;i++) {
			System.out.println(arabalar[i]);
		}	
		
		System.out.println("For döngüsü bitti.");
		
		System.out.println("------------------------------------------------");
	
		int i=0 ;
		while(i<arabalar.length) {
			System.out.println(arabalar[i]);
			i++;
			
		}
		
         System.out.println("While döngüsü bitti.");
		
		System.out.println("------------------------------------------------");
		
		int j=0;
		do {
			System.out.println(arabalar[j]);
			j++;
		}
			while(j<arabalar.length) ;
				
		
	    System.out.println("Do - While döngüsü bitti.");
		
			System.out.println("------------------------------------------------");


	}
	

}
