import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ogrenciListe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<String> adListesi = new ArrayList();
		List<Byte> vizeListesi = new ArrayList();
		List<Byte> finalListesi = new ArrayList();

		int menu = 0;

		do {

			System.out.println("1-Yeni Kayıt Yapın: \n" + "2-Listeleme Yap\n" + "3-İsim Arayın\n" + "4-Kayıt Düzeltin\n"
					+ "5-Kayıt Silin\n");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				Fonksiyonlar.kayitEkle(input,adListesi,vizeListesi,finalListesi);

				break;
			case 2:
				Fonksiyonlar.listele(adListesi,vizeListesi,finalListesi);

				break;
			case 3:
				Fonksiyonlar.arama(input,adListesi,vizeListesi,finalListesi);

				break;
			case 4:
				
				Fonksiyonlar.duzeltme(input,adListesi,vizeListesi,finalListesi);

				break;
			case 5:
				Fonksiyonlar.silme(input,adListesi,vizeListesi,finalListesi);
				break;
				
			case 6:
				byte vizeOrtalama=Fonksiyonlar.Ortalama(vizeListesi);
				System.out.println("Vize Not Ortalaması: "+vizeOrtalama);
				System.out.println("Vize Not Ortalaması: "+Fonksiyonlar.Ortalama(vizeListesi));
				byte finalOrtalama=Fonksiyonlar.Ortalama(finalListesi);
				System.out.println("Vize Not Ortalaması: "+finalOrtalama);
				System.out.println("Vize Not Ortalaması: "+Fonksiyonlar.Ortalama(finalListesi));
				
				break;
			case 7:
				break;
			case 8:
				break;
			
			case 9:
				System.out.println("Program Bitti");
				System.exit(0);

				break;

			default:
				System.out.println("Yanlış Rakam Girdiniz!");
				break;
			}

		} while (menu != 9);

	}
}
