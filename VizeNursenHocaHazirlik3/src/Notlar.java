import java.util.Scanner;

public class Notlar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Öğrenci Adedini Giriniz: ");
		int klavyeile = scanner.nextInt();

		String ogrenciAdi[] = new String[klavyeile];
		int vN[] = new int[klavyeile];
		int fN[] = new int[klavyeile];
		String cinsiyet[] = new String[klavyeile];
		double bN[] = new double[klavyeile];

		for (int i = 0; i < klavyeile; i++) {
			System.out.println("Ogrenci Adı Gir: ");
			ogrenciAdi[i] = scanner.next();
			System.out.println("Ogrenci Vize Gir: ");
			vN[i] = scanner.nextInt();
			System.out.println("Ogrenci Final Gir: ");
			fN[i] = scanner.nextInt();
			System.out.println("Ogrenci Cinsiyet Gir:(E/K) ");
			cinsiyet[i] = scanner.next();
			bN[i] = 0.4 * vN[i] + 0.6 * fN[i];

		}
		byte menu;
		for (;;) {
			fonksiyon.menugor();
			menu = scanner.nextByte();
			switch (menu) {
			case 1:fonksiyon.listele(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 2:fonksiyon.isimAra(scanner,ogrenciAdi, vN,fN,cinsiyet,bN);

				break;
			case 3:fonksiyon.enyuksekbasari(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 4:fonksiyon.enyuksekbasarialternatifilegosterme(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 5:fonksiyon.kizlardanendusukvize(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 6:fonksiyon.erkeklerdeendusukBN(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 7: fonksiyon.kizlarfinalort(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 8:fonksiyon.kizlardaendusukBN(ogrenciAdi,vN,fN,cinsiyet,bN);

				break;
			case 9:System.out.println("Program Bitti");
			System.exit(0);

				break;

			default:
				System.out.println("Yanlış Değer Girdiniz");
				break;
			}
		}

	}

}
