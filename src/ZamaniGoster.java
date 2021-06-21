import java.util.Scanner;

public class ZamaniGoster {
	public static void main(String[] args) {
		System.out.println("lütfen hesaplanacak zamanı giriniz  :");
		Scanner zaman = new Scanner(System.in);
		
		int saniye = zaman.nextInt();
		int dakika = saniye / 60;
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye +" = "+dakika +" dakika ve "+kalanSaniye+" saniyedir." );
	}
}
