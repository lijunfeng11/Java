package com.homework;

import java.util.Random;
import java.util.Scanner;

public class hq {
	public static void main(String[] args) {
		//键盘录入值
		Scanner input = new Scanner(System.in);
		
		//生成随机数
		Random r = new Random();
		int diannao = r.nextInt(3)+1;
		
		System.out.println("开始游戏");
		System.out.println("请输入1,2,3,1为石头2为剪刀3为布");
		
		while(true) {
			int ziji = input.nextInt();
			if(diannao==1&&ziji==1) {
				System.out.println("平局");
			}else if (diannao==1&&ziji==2) {
				System.out.println("电脑赢了");
			}
			else if (diannao==1&&ziji==2) {
				System.out.println("电脑赢了");
			}
			else if (diannao==1&&ziji==3) {
				System.out.println("你赢了");
			}
			else if (diannao==2&&ziji==2) {
				System.out.println("平局");
			}
			else if (diannao==2&&ziji==3) {
				System.out.println("电脑赢了");
			}
			else if (diannao==2&&ziji==1) {
				System.out.println("你赢了");
			}
			else if (diannao==3&&ziji==3) {
				System.out.println("平局");
			}
			else if (diannao==3&&ziji==2) {
				System.out.println("你赢了");
			}
			else if (diannao==1&&ziji==2) {
				System.out.println("电脑赢了");
			}else if(ziji!=1&&ziji!=2&&ziji!=3){
				System.out.println("输入错误，请重新输入");
			}
			
		}
	}
}
