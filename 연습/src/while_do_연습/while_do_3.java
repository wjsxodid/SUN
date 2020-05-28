package while_do_¿¬½À;

import java.util.Scanner;

public class while_do_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input ;
		int sum = 0;
		
		do {
			input= scan.nextInt();
			sum += input;
		}
		while(input != 0);
		System.out.println(sum);
}
}