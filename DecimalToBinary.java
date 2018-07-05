package com.birendra;

public class DecimalToBinary {
	public static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		System.out.println("index:"+index);
		for (int i = index - 1; i >= 0; i--) {
			System.out.println(binary[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		toBinary(10);
	}
}
