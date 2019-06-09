package com.homework;

public class Demo2_while {
public static void main(String[] args) {
	//求100以内的和
	//sum=1+2+3+4+5..+100
	int num=1;
	int sum=0;
	while(num<=100) {
		sum=sum+num;
		num++;
	}
	System.out.println(sum);
	/***
	 * 
	 * 求1-10的阶乘
	 * int num=1;
	 * int sum=1;
	 * while(num<10) {
	 * sum=sum*num;
	 * 	num++;
	 * }
	 * System.out.println(sum);
	
	 */
}
}
