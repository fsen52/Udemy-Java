import java.util.Scanner;

public class KullanıcıdanAlanHesapla {
	public static void main(String[] args) {
		
		Scanner kverisi = new Scanner(System.in);
		
		double yaricap;
		double alan;
		System.out.println("Alanı hesaplanacak dairenin yarıçapını giriniz :  ");
		//yaricapi oku
		
		yaricap = kverisi.nextDouble();
		
		//alan hesapla
		
		alan = yaricap * yaricap * 3.14159;
				
		// alani yazdir
				
		System.out.println("yaricapi " + yaricap + " olan dairenin alani : " + alan + " dır");
	}
}
