import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		System.out.println("lütfen ortalamasını almak istediğiniz 3 sayı giriniz  : ");
		Scanner sayi = new Scanner(System.in);
		
		double gsayi1 = sayi.nextDouble();
		double gsayi2 = sayi.nextDouble();
		double gsayi3 = sayi.nextDouble();
		
		double ortalama = (gsayi1 + gsayi2 + gsayi3)/3;
		
		System.out.println("girilen sayilar  : " + gsayi1 +" , " + gsayi2 + " , " + gsayi3 +" ün ortalaması : " + ortalama);
	}

}
