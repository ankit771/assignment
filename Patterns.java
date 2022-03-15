package com.te.javabasics.accessmodifier;

public class Patterns {
	public static void main(String[] args) {
		patternNumber();
		patternStar();
		patternAlphabet();

	}

	public static void patternNumber() {
		for (int i = 1; i <= 4; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 4 - j;

			}
			System.out.println("\n");

		}
	}

	public static void patternStar() {
		int i, j, k, n = 5;
		for (int i1 = 1; i1 < n; i1++) {
			for (j = n; j > i1; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternAlphabet() {
		char ch = 'A';
		int n = 4;
		for (int i = 1; i <=n; i++) {
			char temp = ch;
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;

			}
			System.out.println(" ");
			ch++;
		}

	}
}