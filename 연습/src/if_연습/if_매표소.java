package if_����;

import java.util.Scanner;

public class if_��ǥ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int charge = 0;
		
		if(age <= 10) {
			charge = 1500;
			System.out.println("����");
		}
		else if(age <= 18) {
			charge = 2000;
			System.out.println("����");
		}
		else {
			charge = 2500;
			System.out.println("����");
		}
		System.out.println("���� =" + age);
		System.out.println("�ݾ� =" + charge);
	}

}
