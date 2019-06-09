package com.day4;

import java.util.concurrent.SynchronousQueue;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class qiantao {
	public static void main(String[] args) {
		/**
		 * for(;;){外循环 for(;;){内循环 } } 执行流程，内循环所有循环执行完毕，外循环执行一次
		 */
		/*
		 * for(int i=1;i<=9;i++) { for(int j=1;j<=9;j++) { //不换行的打印*
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * 123456789
		 * 123456789
		 * 123456789
		 */ 
		 /* for(int i=1;i<=9;i++) { for(int j=1;j<=9;j++) { //不换行的打印*
		 System.out.print(j); } System.out.println(); }
		 */

		
		
		
		/*
		 * 1111111
		 * 2222222
		 * 3333333
		 */
		/*  for(int i=1;i<=9;i++) { for(int j=1;j<=9;j++) { 
		 System.out.print(i); } System.out.println(); }
*/		 
		
		
                       /**
                        *  AAAAAAAAA
                        *  BBBBBBBBB
                        *  CCCCCCCCC
                        *  DDDDDDDDD*/
		/*char ch = 'A';
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// 不换行的打印*
				System.out.print(ch);
				
			}
			System.out.println();
			ch++;
		}*/

		/**
		 * ABCDEFG
		 * ABCDEFG
		 * ABCDEFG
		 * ABCDEFG
		 *//*
		for (int i = 1; i <= 9; i++) {
			char ch = 'A';
			for (int j = 1; j <= 9; j++) {
				// 不换行的打印*
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			
		}*/
		
		/**
		 * 打印*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 实现思路:使用嵌套循环   外循环打印换行   内循环打印* 规律是第几行就打印几个*
		 * 
		 */
	/*	for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*
		 *    1
		 *    23
		 *    345
		 *    4567
		 *    56789
		 * 
		 */
		/*for(int i=1;i<=5;i++) {
			int num=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+i-1);
			}
			System.out.println();
		}*/
		
	/*打印
		********
		*      *
		*      *
		*      *
		********
		*/
	/*	for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 */
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==9 || j==1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		
	}
}
