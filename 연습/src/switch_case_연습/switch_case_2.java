package switch_case_����;

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
			System.out.println("�߸��� �Է��Դϴ�");
			day = 0;
		}
		System.out.println(month + "����" + day + "�� �����Դϴ�");
	}

}
