import java.util.Scanner;


public class Score {


	public static void  main (String args []) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Score : ");
		int x = scan.nextInt();


		Grades mygrade = new Grades();

		
		if(x>=70 && x<=100) {mygrade.a(x);}
		if(x>=65 && x<=69) {mygrade.b(x);}
		if(x>=60 && x<=64) {mygrade.c(x);}
		if(x>=55 && x<=59) {mygrade.d(x);}
		if(x>=45 && x<=54) {mygrade.e(x);}
		if(x>=0 && x<=44) {mygrade.f(x);}
		if(x>100 || x<0) {mygrade.unk(x);}

	


}}
