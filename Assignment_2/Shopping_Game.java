package Assignment_2;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// test case
		while (t-- > 0) {
			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// Harshit
			winner(m, n);
		//	t--;
		}

	}

	public static void winner(int m, int n) {// Aayush , Harshit
		int a = 0, h = 0;
		int phone = 1;
		while (true) {
			a += phone;
			if (a > m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h = h + phone;
			if (h > n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}

	}

}
