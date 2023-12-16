import java.util.Iterator;

public class ornek1 {

	public static void main(String[] args) {
		
		int sayilar[]= {2,14,16,34};
		int toplam = 0;
		for (int i: sayilar) {
			toplam+=i;
			
		}
		System.out.println("toplam: "+toplam);
		System.out.println("ortalama: "+(toplam/sayilar.length));
		System.out.println("ikinci index değeri: "+sayilar[2]);
		
		
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		
		
		System.out.println("index değeri ile ulaşma");
		
		
		
		toplam=0;
		for (int y=0; y<sayilar.length; y++) {
			toplam=toplam+sayilar[y];
		}
		System.out.println(toplam);
		System.out.println((toplam/sayilar.length));
	}

}
