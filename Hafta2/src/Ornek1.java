import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		Scanner girisyapmaogesi = new Scanner(System.in);
		System.out.println("Vize puanı giriniz: ");
		byte vNotu = girisyapmaogesi.nextByte();
		System.out.println("Final puanı giriniz: ");
		byte fNotu = girisyapmaogesi.nextByte();
		byte basariNotu = (byte) ((vNotu + fNotu) / 2);
		System.out.println("Basari Notunuz: " + basariNotu);
		System.out.println("Program Bitti");

		if (basariNotu >= 50)
			System.out.println("Geçtiniz");
		else
			System.out.println("Kaldınız");

		/*
		 * 0-29 FF 30-39 DD 40-49 DC 50-59 CC 60-69 CB 70-79 BB 80-89 BA 90-100 AA
		 */
		if (basariNotu < 30)
			System.out.println("FF aldın kaldın");
		else if (basariNotu < 40)
			System.out.println("DD aldın ucundan geçtin");
		else if (basariNotu < 50)
			System.out.println("DC aldın ucundan geçtin");
		else if (basariNotu < 60)
			System.out.println("CC aldın ucundan geçtin");
		else if (basariNotu < 70)
			System.out.println("CB aldın ucundan geçtin");
		else if (basariNotu < 80)
			System.out.println("BB aldın iyisin");
		else if (basariNotu < 90)
			System.out.println("BA aldın uç");
		else
			System.out.println("AA aldın uç");
		System.out.println("Bitti");

	}

}
