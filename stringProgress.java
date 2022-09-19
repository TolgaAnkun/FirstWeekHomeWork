package firstWeekHomeWork;

public class stringProgress {

	public static void main(String[] args) {
		
		String mesaj ="Türkiye'nin en çok kupa kazanan takımı GalataSaraydır." ;
		
		System.out.println(mesaj);
		
		System.out.println("Kelimedeki karakter sayısı : " + mesaj.length());
		System.out.println("Takımım kısaltması :" + mesaj.charAt(39) + mesaj.charAt(45));
		System.out.println(mesaj.startsWith("T"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler= new char [11] ;
		mesaj.getChars(39, 50, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("G"));
		System.out.println(mesaj.lastIndexOf("y"));
		
		System.out.println("-----------------------------------------------------------");
		
		
		String mesaj2 = "Bugün hava çok güzel.";
		
		System.out.println(mesaj2.replace(' ','-'));
		
		System.out.println(mesaj2.substring(2,4)); 
		
		for(String kelime:mesaj2.split(" ")) {
			
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj2.toLowerCase());
		
		System.out.println(mesaj2.toUpperCase());
	}
	
	
	

}
