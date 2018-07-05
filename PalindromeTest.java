package com.birendra.palindrome;

public class PalindromeTest {
	public String checkForPalindrome(String words) {
		int number = Integer.parseInt(words);
		int rem = 0;
		String sum = "";
		String temp = words;
		while (number > 0) {
			rem = number % 10;
			number = number / 10;
			sum = sum + "" + rem;
		}
		if (temp.equals(sum))
			return words+ " is palindrome";
		else
			return words+ " is not palindrome";
	}

	public static void main(String[] args) {
		System.out.println(new PalindromeTest().checkForPalindrome("343"));
	}
}
