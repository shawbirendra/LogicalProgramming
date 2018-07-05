package com.armstrong;

public class ArmstrongTest {
	public static void isArmstrong(int number) {
		int rem;
		int temp=number;
		int res=0;
		while(number>0) {
			rem=number%10;
			res=res+(rem*rem*rem);
			number=number/10;
		}
		System.out.println(res);
		if(temp==res) {
			System.out.println("given number "+temp+" is armstrong");
		}
	}
	public static void main(String[] args) {
    isArmstrong(153);
	}
}
