package com.birendra;

public class BinaryToDecimalTest {
	public static int getDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int rem = binary % 10;
				decimal = (int) (decimal + rem * Math.pow(2, n));
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println(getDecimal(10101));
	}
}
