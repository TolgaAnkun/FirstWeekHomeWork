package firstWeekHomeWork;

public class multiDimensionalArray {

	public static void main(String[] args) {
	 String [][] yemekler = new String [4][4] ;
	 
	 yemekler[0][0] ="Domates Çorbası";
	 yemekler[0][1] ="Mercimek Çorbası";
	 yemekler[0][2] ="Ezogelin Çorbası";
	 yemekler[0][3] ="Tarhana Çorbası";
	 yemekler[1][0] ="Kuru Falsuye";
	 yemekler[1][1] ="Bezelye";
	 yemekler[1][2] ="Tavuk Sote";
	 yemekler[1][3] ="Kebablar";
	 yemekler[2][0] ="Beyaz Pilav";
	 yemekler[2][1] ="Bulugur Pilavı";
	 yemekler[2][2] ="Erişte";
	 yemekler[2][3] ="Spagetti";
	 yemekler[3][0] ="Ayran";
	 yemekler[3][1] ="Kola";
	 yemekler[3][2] ="Şalgam";
	 yemekler[3][3] ="Soda";

	
	
	
	for(int i=0;i<yemekler.length; i++) {
		System.out.println("------------------------------------------------");
		for(int j=0;j<yemekler.length;j++) {
			System.out.println(yemekler[i][j]);
			}
		}
	}

}
