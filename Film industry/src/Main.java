
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bollywood bollywood = new Bollywood ("Alia");
		Telugu telugu = new Telugu ("NTR", "arka", "rajamouli", bollywood);
		//Kollywood kollywood = new Kollywood("ram lakshman", "santhanam", "janaki", "prabudeva");
  //  Industry industry  = new Industry(telugu, bollywood, kollywood);
		telugu.Tfi();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name");
         String a = sc.next();
         String b = sc.next();
         System.out.println(a +" "+b);
         //System.out.println();
	}

}