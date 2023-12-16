import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Fonksiyonlar {

	public static void kayitEkle(Scanner input, List<String> adListesi, List<Byte> vizeListesi,
			List<Byte> finalListesi) {
		input.nextLine();
		System.out.println("İsim Giriniz: ");
		adListesi.add(input.next());
		System.out.println("Vize Notunu Giriniz: ");
		vizeListesi.add(input.nextByte());
		System.out.println("Final Notunu Giriniz: ");
		finalListesi.add(input.nextByte());
		System.out.println(adListesi.get(adListesi.size() - 1) + " Kaydı Alındı");

	}

	public static void listele(List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		for (int i = 0; i < adListesi.size(); i++) {
			yazdirfonksiyonu(adListesi.get(i), vizeListesi.get(i), finalListesi.get(i));

		}

	}

	private static void yazdirfonksiyonu(String ad, Byte vn, Byte fn) {
		System.out.println("İsminiz: " + ad);
		System.out.println("Vizeniz: " + vn);
		System.out.println("Finaliniz: " + fn);
		System.out.println("Başarı Notunuz: " + (vn * .4 + fn * .6));
		System.out.println("---------------------------------");

	}

	public static void arama(Scanner input, List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		input.nextLine();
		System.out.println("Aranacak Kişi Adını Giriniz: ");
		String arananAd = input.next();
		for (int i = 0; i < adListesi.size(); i++) {
			if (arananAd.equalsIgnoreCase(adListesi.get(i)))
				yazdirfonksiyonu(adListesi.get(i), vizeListesi.get(i), finalListesi.get(i));

		}

	}

	public static void duzeltme(Scanner input, List<String> adListesi, List<Byte> vizeListesi,
			List<Byte> finalListesi) {
		
		input.nextLine();
		System.out.println("Düzeltilecek Kişi Adını Giriniz: ");
		String duzeltilecekAd = input.next();
		for (int i=0; i<adListesi.size(); i++) {
			if(duzeltilecekAd.equalsIgnoreCase(adListesi.get(i))) {
				System.out.println("Yeni Vize Notu Giriniz:");
				byte yeniVizeNotu=input.nextByte();
				System.out.println("Yeni Final Notu Giriniz:");
				byte yeniFinalNotu=input.nextByte();
				vizeListesi.set(i, yeniVizeNotu);
				finalListesi.set(i, yeniFinalNotu);
						
			}
				
				
		}
		
		
	}

	public static void silme(Scanner input, List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		input.nextLine();
		System.out.println("Silinecek Kişinin Adını Giriniz:");
		String silinecekAd=input.next();
		for (int i=0; i<adListesi.size(); i++) {
			if (silinecekAd.equalsIgnoreCase(adListesi.get(i))){
				adListesi.remove(i);
				vizeListesi.remove(i);
				finalListesi.remove(i);
			}
		}
		
	}

	public static byte Ortalama(List<Byte> birsayiListesi) {
		int toplam=0;
		for (Byte sayi : birsayiListesi) {
			toplam+=sayi;
		}
		return (byte) (toplam/birsayiListesi.size());
	}

}
