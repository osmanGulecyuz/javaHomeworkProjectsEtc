import java.util.Scanner;

public class ogrenciKayit {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Kişi Adedini Giriniz:");
		int kisiadedi=input.nextInt();
		String ad[]=new String [kisiadedi];
		int vize[]= new int [kisiadedi];
		int finalN[]=new int [kisiadedi];
		int bN[];
		String cinsiyet[]= new String [kisiadedi];
		
		for (int i =0; i<kisiadedi; i++) {
			System.out.println("Ad Giriniz: ");
			ad[i]=input.next();
			System.out.println("Vize Giriniz: ");
			vize[i]=input.nextInt();
			System.out.println("Final Giriniz: ");
			finalN[i]=input.nextInt();
			
			do {
				System.out.println("Cinsiyet Giriniz: (E/K) ");
				cinsiyet[i]=input.next().toUpperCase();
			
			}
			while(!cinsiyet[i].equals("E") &&!cinsiyet[i].equals("K"));
		}
			
			
			

		
		
		
		for(;;) {
			fonksiyon.menugor();
			int menu=input.nextInt();
			switch (menu) {
			
			case 1: fonksiyon.listele(ad,vize,finalN,cinsiyet);
				break;
			case 2: System.out.println("Aranacak Adı Giriniz: ");
			String arananad=input.next();
				fonksiyon.aramaislemi(arananad,ad,vize,finalN,cinsiyet);
				break;
			case 3: fonksiyon.enyuksekvize(ad,vize,cinsiyet);
				break;
			case 4: fonksiyon.erkekogrencinotortalama(ad,cinsiyet, vize,finalN);
				break;
			case 5: fonksiyon.endusukfinal(ad,vize,finalN,cinsiyet);
				break;
			case 6: System.out.println("Aranacak Kişinin Adını Giriniz: ");
			String arananad2=input.next();
			fonksiyon.aramaislemi2(arananad2,ad,vize,finalN,cinsiyet);
				
				break;
			case 7:
				System.exit(0);
				System.out.println("Program Bitti...");
				break;
				
			default:
				System.out.println("Yanlış Tuşa Bastınız");
				break;
					
			}
		}

		}}


