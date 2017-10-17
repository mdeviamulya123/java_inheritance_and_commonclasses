package java_inheritance_commonclasses_Pe5;

import java.util.Scanner;

public class Pe5 {

	public static void main(String[] args) {

		int n, i;

		System.out.println("Enter the count of numbers");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		int a[] = new int[n];

		for (i = 0; i < a.length; i++) {
			System.out.println("Enter the numbers now" + i);

			a[i] = in.nextInt();

		}

		for (i = 0; i < a.length; i++) {

			if (a[i] + 1 != a[i + 1]) {

				System.out.println("Not consecutive");

			}

			else {
				System.out.println(" consecutive");

			}
		}
	}
}
