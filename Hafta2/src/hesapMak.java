import java.util.Scanner;

public class hesapMak {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Birinci sayıyı gir: ");
		float s1 = giris.nextFloat();
		System.out.println("İkinci sayıyı gir");
		float s2 = giris.nextFloat();
		System.out.println("1-Toplama için \n 2-Çıkarma için \n 3-Çarpma için \n 4- Bölme için");
		byte islemsecimi = giris.nextByte();

		switch (islemsecimi) {
		case 1:
			System.out.println(s1 + " + " + s2 + " =" + (s1 + s2));
			break;
		case 2:
			System.out.println(s1 + " - " + s2 + " =" + (s1 - s2));
			break;
		case 3:
			System.out.println(s1 + " * " + s2 + " =" + (s1 * s2));
			break;
		case 4:
			System.out.println(s1 + " / " + s2 + " =" + (s1 / s2));
			break;
		default:
			System.out.println("Yanlış girdin");
			break;
		}

		/*
		 * if (islemsecimi == 1) System.out.println(s1 + " + " + s2 + " =" + (s1 + s2));
		 * else if (islemsecimi == 2) System.out.println(s1 + " - " + s2 + " =" + (s1 -
		 * s2)); else if (islemsecimi == 3) System.out.println(s1 + " * " + s2 + " =" +
		 * (s1 * s2)); else if (islemsecimi == 4) System.out.println(s1 + " / " + s2 +
		 * " =" + (s1 / s2)); else System.out.println("Hatalı girdin");
		 */

	}

}
