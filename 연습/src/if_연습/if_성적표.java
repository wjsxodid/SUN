package if_����;

import java.util.Scanner;

public class if_����ǥ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		char grade;
		
		if(point >= 90) {
			grade = 'A';
			System.out.println("�Ϻ��մϴ�");
		}
		else if(point >= 80) {
			grade = 'B';
			System.out.println("�Ǹ��մϴ�");
		}
		else if(point >= 70) {
			grade = 'C';
			System.out.println("����ؿ�");
		}
		else if(point >= 60) {
			grade = 'D';
			System.out.println("�Ҽ��־��");
		}
		else {
			grade = 'F';
			System.out.println("����ϼ���");
		} 
		System.out.println("���� =" + point);
		System.out.println("���� =" + grade);
	}

}
