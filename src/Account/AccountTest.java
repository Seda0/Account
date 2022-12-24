package Account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String adi;
		String soyadi;
		int yasi;
		System.out.println("Adinizi Giriniz:");
		Scanner s = new Scanner(System.in);
		adi = s.nextLine();
		System.out.println("Soy adinizi Giriniz :");
		soyadi = s.nextLine();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Yasinizi Giriniz :");
		yasi = s1.nextInt();

		// Nesnemizi oluşturduk
		
		Account person=new Account(adi,soyadi,yasi);
		System.out.println("Hosgeldiniz :"+person.getName()+" "+person.getSurname()+"" +person.getYas());
		
		person.setName("Sirin");
		person.setName("Saglik");
		person.setYas(20);
		System.out.println("Hosgeldiniz :"+person.getName());
		

	}

}
