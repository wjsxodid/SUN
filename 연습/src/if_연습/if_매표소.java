package if_연습;

import java.util.Scanner;

public class if_매표소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int charge = 0;
		
		if(age <= 10) {
			charge = 1500;
			System.out.println("소인");
		}
		else if(age <= 18) {
			charge = 2000;
			System.out.println("중인");
		}
		else {
			charge = 2500;
			System.out.println("대인");
		}
		System.out.println("나이 =" + age);
		System.out.println("금액 =" + charge);
	}

}
