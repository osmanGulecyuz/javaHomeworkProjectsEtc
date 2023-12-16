import java.util.Scanner;

public class fonksiyon {

	public static void menu() {
		System.out.println("1-Yeni Kayıt Ekle: \n"
				+ "2-Listeleme Yap: \n"
				+ "3-Yazar Ara: \n"
				+ "4-Stok Adetlerinin Ortalaması: \n"
				+ "5-Kitap Sayfalarının Ortalaması: \n"
				+ "6-Aranan Yazarın Kitap Adedi: \n"
				+ "7-Aranan Yazarın Türkçe En Çok Sayfalı Kitabının Adı: \n"
				+ "8-Aranan Yazarın En Az Sayfalı Kitabının Sayfa Adedi:\n "
				+ "9-Çıkış");
		
	}

	public static void kitapEkle(Scanner kGiris, String[] kitapAdi, int[] sayfaSayisi, String[] yazarAdi,
			String[] kitapTuru, String[] dil, int[] kitapStokAdedi, byte suangirilenkitapadedi) {
		
		/*temizlik*/
		kGiris.nextLine();
		
		
		System.out.println("Kitap Adı Gir:");
		kitapAdi[suangirilenkitapadedi]=kGiris.next();
		
		System.out.println("Sayfa Sayısı Gir:");
		sayfaSayisi[suangirilenkitapadedi]=kGiris.nextInt();
		
		System.out.println("Yazar Adı Gir:");
		yazarAdi[suangirilenkitapadedi]=kGiris.next();
		
		System.out.println("Kitap Türü Gir:");
		kitapTuru[suangirilenkitapadedi]=kGiris.next();
		
		System.out.println("Dil Gir:");
		dil[suangirilenkitapadedi]=kGiris.next();
		
		System.out.println("Stok Adedi Gir:");
		kitapStokAdedi[suangirilenkitapadedi]=kGiris.nextInt();
		
		
		
		
		
		
		
	}

	public static void Listele(String[] kitapAdi, int[] sayfaSayisi, String[] yazarAdi, String[] kitapTuru,
			String[] dil, int[] kitapStokAdedi) {
		for (int i=0; i<kitapAdi.length;i++) {
			System.out.println(kitapAdi[i]+" "+sayfaSayisi[i]+" "+yazarAdi[i]+" "+kitapTuru[i]+" "+dil[i]+" "+kitapStokAdedi[i]);
			System.out.println("--------------------------------");
			
		}
		
		
	}

	public static void yazarArama(String suAnArananYazar, String[] kitapAdi, int[] sayfaSayisi, String[] yazarAdi,
			String[] kitapTuru, String[] dil, int[] kitapStokAdedi) {
		for (int i=0; i<kitapAdi.length; i++) {
			if(yazarAdi[i].equalsIgnoreCase(suAnArananYazar)) {
				System.out.println("Aradığınız yazar bulundu "+"Yazarın Adı: "+yazarAdi[i]);
			}else System.out.println("Yazar Bulunamadı");
		}

		
		
	}

	

		
	public static void ortalama(byte kitapadedi, int [] kitapStokAdedi) {
		int toplam=0;
		for (int i=0;i<kitapadedi; i++) {
			toplam+=kitapStokAdedi[i];
		}System.out.println(toplam/kitapadedi);
	}

	public static void StokAdetOrtalama(byte kitapadedi, int[] kitapStokAdedi) {
		ortalama(kitapadedi, kitapStokAdedi);
		
	}
	
	
	
	
}
