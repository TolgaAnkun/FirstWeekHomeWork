package firstWeekHomeWork;

public class demoTry {

	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Tolga";
		ogrenciler[1] = "Gökhan";
		ogrenciler[2] = "Samet";
		ogrenciler[3] = "Çağlar";

		int[][] grades = new int[4][2];

		grades[0][0] = 34;
		grades[0][1] = 50;
		grades[1][0] = 60;
		grades[1][1] = 70;
		grades[2][0] = 80;
		grades[2][1] = 90;
		grades[3][0] = 100;
		grades[3][1] = 100;

		int i = 0;
		while (i < ogrenciler.length) {

			for (int j = 0; j < grades.length; j++) {
				System.out.println("-------------");

				for (int k = 0; k < grades[j].length; k++) {
					

					System.out.println(ogrenciler[i] + " ' nın " + (k + 1) + ". sınavı : " + grades[j][k]);
					
					

				}

				i++;
			}

		}

	}

}
