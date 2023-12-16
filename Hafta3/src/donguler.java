import java.util.Iterator;

public class donguler {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i+=1 ) {
			System.out.println(i+" Okan Uni");
	} 
		
	for(int i=0; i<=10;i++) {
		//if(i==3 ||i==6 ) continue;
		//if (i==5) break;
		if (i%2==1) continue;
		System.out.println(i);
		if (i==6) break;
		//if (i==5) break;
		//burada i 5 bile olmayacağı için zaten gitmez ama if i==5 yukarıda continue üstünde olsaydı 
		//o zaman 5'e kadar max gidip çiftleri seçerdi
		}
		
	}
}

