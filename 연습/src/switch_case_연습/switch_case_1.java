package switch_case_����;

import java.util.Scanner;

public class switch_case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rank = scan.nextInt();
		char medal;
		
		switch(rank) {
		case 1 : medal = 'G';
			break;
		case 2 : medal = 'S';
			break;
		case 3 : medal = 'B';
			break;
		default : medal = 'A';
		}
		System.out.println("������" + rank);
		System.out.println("�޴޻���" + medal + "�Դϴ�");
		
	}

}
