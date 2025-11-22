package Assignment_2;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));

	}

	public static long Chewbacca(long n) {
		long num = 0;
		long mul = 1;
		while (n > 9) {
			long rem = n % 10;
			if (rem >= 5) {
				rem = 9 - rem;
			}
			num = num + rem * mul;
			mul = mul * 10;
			n = n / 10;
		}
		if (n == 9 || n < 5) {
			num = num + n * mul;
		} else {
			num = num + (9 - n) * mul;
		}
		return num;
	}

}
