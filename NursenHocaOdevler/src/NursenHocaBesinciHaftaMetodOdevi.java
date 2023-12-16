import java.util.Scanner;

public class NursenHocaBesinciHaftaMetodOdevi {

	public static void main(String[] args) {
		
		
		Scanner klavye=new Scanner(System.in);
		System.out.print("Kişi Adedini Giriniz: ");
		int kisi=klavye.nextInt();
		String ad[]=new String [kisi];
		byte yas[]= new byte [kisi];
		String cinsiyet[]=new String [kisi];
		int maas[]= new int [kisi];
		
		
	
		
		for (int i=0; i<kisi; i++) {
			
			System.out.print(i+1+" numaralı kişinin adını giriniz: ");
			ad[i]=klavye.next();
			System.out.print(i+1+" numaralı kişinin yaşını giriniz: ");
			yas[i]=klavye.nextByte();
			System.out.print(i+1+" numaralı kişinin cinsiyetini giriniz (Erkek/Kadın): ");
			cinsiyet[i]=klavye.next();
			System.out.print(i+1+" numaralı kişinin maaşını giriniz: ");
			maas[i]=klavye.nextInt();
			System.out.println("--------------------------------------------");
			
			
		}
		
		byte menu;/*burada menu=klavye.next girmezsen menu sonsuz donguye girer*/
		for(;;) {
			Fonksiyonlar.menugoruntuleme();
			menu=klavye.nextByte();
			switch(menu) {
			case 1:
				Fonksiyonlar.Listeleme(ad,yas,cinsiyet,maas);
				
				
				break;
				
			case 2:/*burada aranacak kişinin adını ilk parametre olarak parantez içinde
				göndermezsen diğer tarafta anlaşılmaz*/
				
				System.out.println("Aranacak Kişi Adını giriniz");
				String azoncegirilenisim=klavye.next();
				Fonksiyonlar.adarama(azoncegirilenisim, ad,yas,cinsiyet,maas);
				
				break;
				
			case 3:
				
				Fonksiyonlar.yasvemaasort(yas,maas);
				
				break;

				
			case 4: 
				Fonksiyonlar.enbuyukyasvebilgileri(yas,ad,cinsiyet,maas);
				break;
			
			case 5:
				Fonksiyonlar.enkucukyasvebilgiler(ad,yas,cinsiyet,maas);
				break;
			case 6:
				int erkekyasort=Fonksiyonlar.erkekyasortalama(cinsiyet,yas);
				System.out.println("Erkek Yaş Ortalaması: "+erkekyasort);
				break; 
			case 7:
				int kadinyasort=Fonksiyonlar.kadinyasortalama(cinsiyet,yas);
				System.out.println("Kadın Yaş Ortalaması: "+kadinyasort);
				break;
				
			case 8: 
				int kadinmaasort=Fonksiyonlar.kadinmaasortalam(cinsiyet,maas);
				System.out.println("Kadın Maaş Ortalaması"+kadinmaasort);
				break;
				
			case 9:
				System.out.println("Program Bitti...");
				System.exit(0);
				break;
				
			default: 
				System.out.println("Yanlış tuşa bastınız");
				break;
					
			}
			
		}
		

	}

}
