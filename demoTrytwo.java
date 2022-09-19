package firstWeekHomeWork;

public class demoTrytwo {

	public static void main(String[] args) {
		String[] arabalar = new String[3];

		arabalar[0] = "Mercedes";
		arabalar[1] = "Renault ";
		arabalar[2] = "Citroen";

		int[][] fiyat = new int[3][2];

		fiyat[0][0] = 100000;
		fiyat[0][1] = 300000;
		fiyat[1][0] = 60000;
		fiyat[1][1] = 140000;
		fiyat[2][0] = 120000;
		fiyat[2][1] = 230000;

		int i = 0;
		while (i < arabalar.length) {

			

			for (int j = 0; j < fiyat.length; j++) {
				System.out.println("----------------------");
				for (int k = 0; k < fiyat[j].length; k++) {
					System.out.println(arabalar[i] + "' nın " + (k + 1) + ". fiyatı : " + fiyat[j][k]);
				}

				i++;
			}

		}

	}

}
