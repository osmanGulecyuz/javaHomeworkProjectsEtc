import java.util.Scanner;

public class NursenHocaDersOrnekMetodFonksiyon {

	public static void main(String[] args) {
		
		Scanner inputt= new Scanner(System.in);
		System.out.print("Kişi adedini giriniz: ");
		byte kisi=inputt.nextByte();
		
		String ad[]=new String [kisi];
		int yas[]=new int [kisi];
		String [] cinsiyet=new String [kisi];
		
		for (int i=0; i<kisi;i++) {
			System.out.print(i+1+". kişinin adını giriniz: ");
			ad[i]=inputt.next();
			System.out.print(i+1+". kişinin yaşını giriniz: ");
			yas[i]=inputt.nextInt();
			System.out.print(i+1+". kişinin cinsiyetini giriniz: ");
			cinsiyet[i]=inputt.next();
		}
		byte menu;
		for(;;){
			NursenHocaDersOrnekMetodFonksiyonlari.MenuGor();
			menu=inputt.nextByte();
			switch (menu) {
			
			case 1:NursenHocaDersOrnekMetodFonksiyonlari.Listeleme(ad,yas,cinsiyet);
				
				break;

			case 2: System.out.println("Aranacak kişi adı girin");
			String arananAd=inputt.next();
			NursenHocaDersOrnekMetodFonksiyonlari.Aramafonksiyonu(arananAd,ad,yas,cinsiyet);
				
				break;
			
			case 3: NursenHocaDersOrnekMetodFonksiyonlari.okulDurumu(ad,yas);
			
				break;
				
			case 4: int yasOrt=NursenHocaDersOrnekMetodFonksiyonlari.ErkekYasOrt(cinsiyet,yas);
			System.out.println("Erkek yaş ortalaması: "+yasOrt);
			
				break;
			
			case 5: System.out.println("Program bitti");
			System.exit(0);
				break; 
			
			default:
				System.out.println("Yanlış değer girdiniz");
				break;
			}
		}
		

	}

}
