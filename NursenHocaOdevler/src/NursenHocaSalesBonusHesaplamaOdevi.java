/* bu ödevde 7. ve 8. maddeler ne yazık ki saatler süren denemelere rağmen yapılamadı*/

import java.util.Scanner;

public class NursenHocaSalesBonusHesaplamaOdevi {
	
	
	/*satiscilar parfum ya da kozmetik ürün satabilirler. Parfüm basına 500 tl kozmetik
	 * içinse 400 tl ürün satışı vardır. Satışçılar her ürün için 0.1% bonus alırlar. 
	 * Bonus tutarı sattıkları ürün grubundan parfüm bonus toplamı 150,000'i geçerse bonus
	 * 1.5 ile çarpılır, kozmetik toplamı 100,000 üzerindeyse bu sefer toplam 1.2 ile 
	 * çarpılır.
	 * Menu ile 1- listeleme 2- bonus hesaplama 3- satışçı arama 4-
	 * en çok adet satan ürün ve geliri ve bunu yapan satışçının tüm bilgileri
	 * 5-Satılan parfüm adedi ve tutarı 6- Satılan kozmetik ve tutarı 7-En yüksek
	 *  bonus ile bunların sahipleri 8-En düşük gelirli lokasyon 
	 * 9-Çıkış 
	 * ek olarak sadece Beyoglu veya Kadıkoy girilebilir, sadece Parfum ya da Kozmetik girilebilir.Baska kelime input
	 * edilmez.
	 */

	public static void main(String[] args) {
		Scanner submitbykeyboard=new Scanner(System.in);
		System.out.println("Kaç Adet Satışçı Bilgisi Girilecek? ");
		byte satisci=submitbykeyboard.nextByte();
		String urun[]= new String [satisci];
		int adet[]= new int [satisci];
		String ad[]= new String [satisci];
		String lokasyon[]= new String [satisci];
		
		for (int i=0; i<satisci; i++) {
			System.out.println("İsim giriniz: ");
			ad[i]=submitbykeyboard.next();
			
			
			System.out.println("Lokasyon giriniz (Beyoglu/Kadikoy): ");
			
			String girilenlokasyon=submitbykeyboard.next();
			
			while (!girilenlokasyon.equalsIgnoreCase("Beyoglu")&&!girilenlokasyon.equalsIgnoreCase("Kadikoy")) {
				System.out.println("Hatalı giriş! Lütfen 'Beyoglu' veya 'Kadikoy' giriniz.");
				System.out.println("Lokasyon giriniz (Beyoglu/Kadikoy): ");
				girilenlokasyon=submitbykeyboard.next();
			}
			
			
			lokasyon[i]=girilenlokasyon;
			
			
			
			
			System.out.println("Kaç ürün satıldı: ");
			adet[i]=submitbykeyboard.nextInt();
			
			
			
			System.out.println("Ürün adı giriniz (Parfum/Kozmetik): ");
		
			String girilenurun=submitbykeyboard.next();
			
			while (!girilenurun.equalsIgnoreCase("Parfum")&&!girilenurun.equalsIgnoreCase("Kozmetik")) {
				System.out.println("Hatalı giriş! Lütfen 'Parfum' veya 'Kozmetik' giriniz.");
                System.out.println("Ürün adı giriniz (Parfum/Kozmetik): ");
                girilenurun=submitbykeyboard.next();

			}
			
			
			urun[i]=girilenurun;
			
			

			
			
		}
		
		byte menu;
		for (;;) {
			salesbonusFonksiyonlar.menugoruntuleme();
			menu=submitbykeyboard.nextByte();
			switch(menu) {
			
			case 1: 
				salesbonusFonksiyonlar.tumBilgiler(ad,lokasyon,urun,adet);
				
				break;
				
			case 2: 
				salesbonusFonksiyonlar.tumBonuslar(ad,lokasyon,urun,adet);
				
				
				break;
				
			case 3: /* burada submitkeyboard ile girilenad fonksiyon ile beraber gönderilir ki karşı
			karşı tarafa gidebilsin */
				
				System.out.println("Aranacak İsmi Giriniz");
				String girilenAd= submitbykeyboard.next();
				salesbonusFonksiyonlar.adarama(girilenAd,urun,adet,ad,lokasyon);
				
				break;
				
			case 4: 
				salesbonusFonksiyonlar.encoksatanurunvebilgileri(ad,lokasyon,urun,adet);
				
				break;
				
			case 5:
				salesbonusFonksiyonlar.satilanparfumvetutar(ad,lokasyon,urun,adet);
				break;
			case 6: 
				salesbonusFonksiyonlar.satilankozmetikadedivetutari(urun,adet);
				break;
			case 7: /* yapamadım*/ 
				salesbonusFonksiyonlar.enyuksekbonuslueleman(ad,lokasyon,urun,adet);
				break;
			case 8: 
				salesbonusFonksiyonlar.enyuksekgelirlilokasyon(ad,lokasyon,urun,adet);
				break;
			case 9: 
				System.out.println("Programın sonuna geldiniz");
				System.exit(0);
				break;
			default:
				System.out.println("Menüden yanlış fonksiyon seçtiniz");
				break;
				
					
			
				
			}
			
		}
		
		
		
	}

}
