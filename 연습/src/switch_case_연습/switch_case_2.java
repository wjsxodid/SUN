package switch_case_연습;

import java.util.Scanner;

public class switch_case_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day;
		
		switch(month) {
		case 1 : case 3 : case 5: case 7 : case 9 : case 11 :
			day = 31;
			break;
		case 4 :  case 6 : case 8 : case 10 : case 12 :
			day = 30;
			break;
		case 2 :
			day = 28;
			break;
		default : 
			System.out.println("잘못된 입력입니다");
			day = 0;
		}
		System.out.println(month + "월은" + day + "일 까지입니다");
	}

}
