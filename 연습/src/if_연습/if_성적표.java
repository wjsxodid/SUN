package if_연습;

import java.util.Scanner;

public class if_성적표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		char grade;
		
		if(point >= 90) {
			grade = 'A';
			System.out.println("완벽합니다");
		}
		else if(point >= 80) {
			grade = 'B';
			System.out.println("훌륭합니다");
		}
		else if(point >= 70) {
			grade = 'C';
			System.out.println("평범해요");
		}
		else if(point >= 60) {
			grade = 'D';
			System.out.println("할수있어요");
		}
		else {
			grade = 'F';
			System.out.println("노력하세요");
		} 
		System.out.println("점수 =" + point);
		System.out.println("성적 =" + grade);
	}

}
