import java.util.Scanner;

public class kutuphane {

	public static void menu() {
		System.out.println("1-Kayıt Ekle\n" + "2-Listele: \n" + "3-Kitap Ara:\n" + "4-Yazar Ara:\n"
				+ "5-Yazar Ait En Eski Kitabı Ara:\n" + "6-Ortalama Kitap Sayfa Sayfası:\n" + "7-Çıkış");

	}

	public static void kayitEkleme(Scanner kayitEkle, String[] kitapAdi, String[] yazarAdi, int[] basimYili,
			int[] sayfaSayisi, int girilenkitapadedi) {

		kayitEkle.nextLine();

		System.out.println("Kitap Adı Giriniz: ");
		kitapAdi[girilenkitapadedi] = kayitEkle.next();
		System.out.println("Yazar Adı Giriniz: ");
		yazarAdi[girilenkitapadedi] = kayitEkle.next();
		System.out.println("Basım Yılı Giriniz: ");
		basimYili[girilenkitapadedi] = kayitEkle.nextInt();
		System.out.println("Sayfa Sayisi Giriniz: ");
		sayfaSayisi[girilenkitapadedi] = kayitEkle.nextInt();

	}

	public static void listele(String[] kitapAdi, String[] yazarAdi, int[] basimYili, int[] sayfaSayisi) {
		for (int i = 0; i < kitapAdi.length; i++) {
			System.out.println("Kitap Adi " + kitapAdi[i]);
			System.out.println("Yazar Adi " + yazarAdi[i]);
			System.out.println("Basim Yılı " + basimYili[i]);
			System.out.println("Sayfa Sayisi " + sayfaSayisi[i]);
			System.out.println("---------------------------------");
		}

	}

	public static void kitapAra(Scanner kayitEkle, String[] kitapAdi, String[] yazarAdi, int[] basimYili,
			int[] sayfaSayisi) {
		System.out.println("Aranan Kitabı Giriniz: ");
		String arananKitap = kayitEkle.next();
		for (int i = 0; i < kitapAdi.length; i++) {
			if (arananKitap.equalsIgnoreCase(kitapAdi[i])) {
				listele(kitapAdi, yazarAdi, basimYili, sayfaSayisi);
			}
		}

	}

	public static void yazarAra(Scanner kayitEkle, String[] kitapAdi, String[] yazarAdi, int[] basimYili,
			int[] sayfaSayisi) {
		System.out.println("Aranan Yazarın Adını Giriniz: ");
		String arananYazar = kayitEkle.next();
		for (int i = 0; i < kitapAdi.length; i++) {
			if (arananYazar.equalsIgnoreCase(yazarAdi[i])) {
				listele(kitapAdi, yazarAdi, basimYili, sayfaSayisi);
			}
		}

	}

	public static void yazarAitEskiKitapAra(Scanner kayitEkle, String[] kitapAdi, String[] yazarAdi, int[] basimYili,
			int[] sayfaSayisi) {
		System.out.println("Aranan Yazarın Adını Giriniz: ");
		String arananYazar = kayitEkle.next();
		int enesk = Integer.MAX_VALUE;
		String yzr="";
		for (int i = 0; i < kitapAdi.length; i++) {
			if (arananYazar.equalsIgnoreCase(yazarAdi[i])) {
				
				if (basimYili[i] < enesk) {
					enesk = basimYili[i];
					yzr =yazarAdi[i];
					
				}
					
		

			}

		}System.out.println("En Eski Kitap" + enesk+" "+"Yazarı: "+yzr);
		System.out.println("---------------------------------");

	}

	public static int ortalamaKitapSayfaSayisi(String[] kitapAdi, String[] yazarAdi, int[] basimYili,
			int[] sayfaSayisi) {
		int ortalama=0;
		int kitapsayfatoplami=0;
		int kitapsayisi=0;
		for (int i=0; i<kitapAdi.length; i++) {
			
			kitapsayfatoplami+=sayfaSayisi[i];
			kitapsayisi+=1;
			
			
			
		
		}
		ortalama=(kitapsayfatoplami/kitapsayisi);	
		/*System.out.println(ortalama);*/
		return(ortalama);
		
		
		
		 
		
		
	}
}
