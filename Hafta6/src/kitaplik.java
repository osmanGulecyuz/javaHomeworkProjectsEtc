import java.util.Scanner;

public class kitaplik {

	public static void main(String[] args) {

		Scanner girisyap = new Scanner(System.in);
		System.out.println("Kitap adedini giriniz:");
		int kitapAdetUzunluk = girisyap.nextInt();

		String kitapAdi[] = new String[kitapAdetUzunluk];
		String yazarAdi[] = new String[kitapAdetUzunluk];
		int sayfaSayisi[] = new int[kitapAdetUzunluk];
		int basimYili[] = new int[kitapAdetUzunluk];
		byte menu = 0;
		int kitapSayisi = 0;

		do {
			System.out.println("1-Kayit Girisi Yapiniz:\n2-Listeleme: " + 
					"\n3-Yazar Adına Göre Kitap Arama: "
					+ "\n4 En Yeni Kitap: \n"
					+ "5-Toplam Kitap Adedi: \n"
					+ "6-Sayfa Sayı Ortalaması: \n"
					+ "7-Basım Yılı Ortalaması: \n"
					+ "8-Aranan Yazarın en çok sayfalı kitabı nedir?\n"
					+ "9-ÖÇıkış Yap");
			

			menu = girisyap.nextByte();

			switch (menu) {

			case 1:
				if (kitapSayisi < kitapAdetUzunluk) {
					System.out.println("Şu ana kadar girilen kitap adedi: " + kitapSayisi);
					System.out.println("İlk seferde girilen kitap adedi: " + kitapAdetUzunluk);
					System.out.println("--------------------------");

					FonkKitaplik.kitapEkle(girisyap, kitapAdi, yazarAdi, sayfaSayisi, basimYili, kitapSayisi);
					kitapSayisi++;
				} else {
					System.out.println("--------------------------");
					System.out.println("İlk başta girdiğiniz adetten fazla giriş yapmaya çalışıyorsunuz!");
					System.out.println("--------------------------");
				}
				break;

				
			case 2:

				for (int i = 0; i < kitapSayisi; i++)

					FonkKitaplik.listeleme(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
				break;

				
			case 3:
				System.out.println("Aranacak Yazarı Giriniz: ");
				String arananYazar = girisyap.next();
				FonkKitaplik.yazarArama(kitapAdi, yazarAdi, sayfaSayisi, basimYili, arananYazar);

				break;

				
			case 4:
				FonkKitaplik.enSon(kitapAdi, yazarAdi, sayfaSayisi, basimYili);
				
				
				break;
				
				

			case 5:
				/*yukarıda aldığınla al uzatma kolayca geç*/
				FonkKitaplik.toplamKitapAdedi(kitapAdetUzunluk); 
				/* alternatif*/
				System.out.println("Toplam Litap Adedi: "+kitapAdetUzunluk);
				
				break;

			case 6:
				
				FonkKitaplik.ortalamaSayfaSayisi(sayfaSayisi);
				
				break;

			case 7:
				
				FonkKitaplik.basimYiliOrtalamasi(basimYili);
				
				break;

			case 8:
				System.out.println("Kitabını Aramak İstediğiniz Yazarı Giriniz: ");
				String AY=girisyap.next();
				FonkKitaplik.arananYazarinEnbSayfaliKitabi(kitapAdi,yazarAdi, basimYili, sayfaSayisi,AY);
				
				
				
				break;

			case 9:
				System.out.println("Program Bitti");
				System.exit(0);

			default:
				System.out.println("Yanlış değer girdiniz:");

			}

		} while (menu != 10);

	}

}
