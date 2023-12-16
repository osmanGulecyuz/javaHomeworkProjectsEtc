import java.util.Scanner;

public class kitap {

	public static void main(String[] args) {

		Scanner kayitEkle = new Scanner(System.in);
		
		System.out.println("Kütüphaneye Hoşgeldiniz! ");
		System.out.println("Kitap Adedi Giriniz: ");

		int kitapAdedi = kayitEkle.nextInt();

		String kitapAdi[] = new String[kitapAdedi];

		String yazarAdi[] = new String[kitapAdedi];

		int basimYili[] = new int[kitapAdedi];

		int sayfaSayisi[] = new int[kitapAdedi];
		
		int girilenkitapadedi=0;
		byte secim = 0;

		do {
			kutuphane.menu();
			secim = kayitEkle.nextByte();

			switch (secim) {
			
			case 1:
			if (girilenkitapadedi<kitapAdedi) {
				kutuphane.kayitEkleme(kayitEkle, kitapAdi, yazarAdi, basimYili, sayfaSayisi,girilenkitapadedi);
				girilenkitapadedi++;
			}else System.out.println("Fazla Kitap Girdiniz.");
			
				break;
			case 2:kutuphane.listele(kitapAdi, yazarAdi, basimYili, sayfaSayisi);

				break;
			case 3:kutuphane.kitapAra(kayitEkle,kitapAdi, yazarAdi, basimYili, sayfaSayisi);
			

				break;
			case 4:kutuphane.yazarAra(kayitEkle,kitapAdi, yazarAdi, basimYili, sayfaSayisi);

				break;
			case 5:kutuphane.yazarAitEskiKitapAra(kayitEkle, kitapAdi, yazarAdi, basimYili, sayfaSayisi);

				break;
				case 6:kutuphane.ortalamaKitapSayfaSayisi(kitapAdi, yazarAdi, basimYili, sayfaSayisi);
				break;
			case 7:System.out.println("Programın sonuna geldiniz...");
			System.exit(0);
				break;

			default:System.out.println("Yanlış değer girdiniz");
				break;
				
			}

		} while (secim != 7);

	}

}
