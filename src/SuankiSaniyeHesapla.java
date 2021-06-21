
public class SuankiSaniyeHesapla {

	public static void main(String[] args) {
	
	long milisaniye = System.currentTimeMillis();
	
	long suansaniye = (milisaniye / 1000) %60;
	
	System.out.println("Şuanki saniye : "+ suansaniye);
	
	
	
	}
	
	
}
