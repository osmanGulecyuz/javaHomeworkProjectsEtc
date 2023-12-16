import java.util.Scanner;

public class DenemeEgitimPazar {

	public static void main(String[] args) {
		
		Scanner klavyeinputuyap=new Scanner(System.in);
		int zaman;
		System.out.println("Saat gir");
		zaman = klavyeinputuyap.nextInt();
		
		switch (zaman) {
		
		case 6:
			System.out.println("Erken saat daha "+zaman+" Yat uyu");
			break;

		case 8:
			System.out.println("Erken lan saat daha "+zaman+" Yat uyu");
			break;

		case 10:
			System.out.println("uyan saat "+zaman);
			break;

		case 12:
			System.out.println("ders calis saat "+zaman);
			break;
		default: 
			System.out.println("Keyfine bak");
		}

	}

}
