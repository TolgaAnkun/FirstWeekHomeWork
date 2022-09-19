package firstWeekHomeWork;

public class usingConditionals {

	public static void main(String[] args) {
		
			
		int ilkSinavPuani = 60 ;
		int sonSinavPuani = 50 ;
		double ortalamaPuan = (ilkSinavPuani*40/100)+(sonSinavPuani*60/100);
		
		
		if (ortalamaPuan>50) {
			System.out.println(ortalamaPuan + " Ortalama ile Geçtiniz. ");
			
		
			
						
		} else if(ortalamaPuan==50){
			System.out.println(ortalamaPuan + " Ortalama ile Şartlı Geçtiniz.");
			

		} else {
			
			
				System.out.println(ortalamaPuan + " Ortalama ile Kaldınız. ");
				
		}
		
		
	
}
}

