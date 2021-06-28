
import java.util.Scanner;

public class FaizHesaplama {

	public static void main(String[] args) {

		Scanner girdi = new Scanner(System.in);

		System.out.println("Hesaplamak istediğiniz yıllık faiz oranını giriniz  :");

		double faizOranı = girdi.nextDouble();

		System.out.println("Ödemek istediğiniz yıl sayısını giriniz  :");

		int yıl = girdi.nextInt();

		System.out.println("Borç miktarını giriniz :");
		double borcMiktarı = girdi.nextDouble();
		
		System.out.println("Toplam borç miktarınız  : " + (borcMiktarı + (faizOranı / 100) * borcMiktarı * yıl ));

	}
}
