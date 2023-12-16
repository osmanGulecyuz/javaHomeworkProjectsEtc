import java.util.Scanner;

public class Ornek1ekstra {

	public static void main(String[] args) {

		Scanner girisyap=new Scanner(System.in);
		System.out.println("Vize gir: ");
		byte vize= girisyap.nextByte();
		System.out.println("Final gir: ");
		byte finalN=girisyap.nextByte();
		byte basarinotu=(byte) ((vize+finalN)/2);
		System.out.println("Gecis Notun: "+basarinotu);
		/*if (basarinotu >=50)
			System.out.println("Geçtin");
		else System.out.println("Kaldın");
		(basarinotu >=50)?System.out.println("Geçtin");:System.out.println("Geçtin");
*/		byte bSayi= vize>finalN ? vize:finalN;
		/*byte bSayi;
		if(vize>finalN) bSayi=vize;
		else bSayi=finalN;
	*/	System.out.println("Büyük olan " + bSayi);

	}

}
