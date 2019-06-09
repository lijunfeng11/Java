package com.homework;//创建包

public class Homework2_6 {
    public static void main(String[] args) {
/*	int num1=9;
	int num2=10;
	
	//=赋值运算符吧右边的结果赋值给左边的变量
	num1=num2;//num1和num2都是10
	num2=num2;//num1和num2都9
	
	
	//复合赋值运算符
	num1 +=5;//num1=num1+5
	
	num1 *=2+3;//num1=num1*(2+3)
	
	
	 * 笔试题问snum=snum+5;（这个报错）
			  snum+=5;
			  是否一样
			
	 
	short snum=1;
	//snum=snum+5;//等号右边表达式结果为int类型，左边变量short，数据类型不兼容
	snum+=5;//复合赋值运算符，会自动将结果类型转换为snum=(shourt)(snum+5)
    
    
     * 
     * &&（与）||（或）！（非）
     * 与  两边条件中只要一个表达式的结果为false就为假（有假为假）
     * 或  有真为真
     * &&（与）||（或）是短路运算符
     * 
     
	
    int num=5;
    //短路运算
    System.out.println(num<5&&++num<10);
    //因为num<5是false,所以++num<100不做判断被短路（前面为假后面不继续，但是前面是真后面继续）
    System.out.println(num);//运行结果为5
    System.out.println(num==5 || ++num<10);//由于num==5为true，所以++num<10不再做判断被短路掉
    System.out.println(num);//运行结果为5
   
   */
   /* *位运算符（与&& 和|| 区别就是不短路）
    * & （有假为假）| （有真为真）
    * 
    * 
    */
   double num1=3.1415926;
   System.out.printf("num1=%10f\n", num1);
   System.out.printf("num2=%7.3f\n",num1); 
   
    }
}

