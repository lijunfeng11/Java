package com.homework;

public class Demo8_作业5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 有一口井7米深，一只青蛙白天爬3米，晚上坠下2米，问几天能爬完
		 */
	int day=0;
	int free=7;//距离自由还有多少米
	while(free>0){
		day++;
		free=free-3;
		if(free<=0) {//白天已经自由
		break;
		}
		free=free+2;//距离自由有多了2天
	}
	System.out.println("这只青蛙"+day+"天自由");
	}

}
