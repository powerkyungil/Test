package com.yedam.java.homework;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====문제1=====");
		
		   int x = 37;
		   int y = 91;
		   System.out.println("변수형1:" + x + ", 변수형2:" + y);
		   
		   System.out.println("=====문제2=====");
		   
		   /* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		   2.1) 91 더하기 37
		   2.2) 91 빼기 37
		   2.3) 91 곱하기 37
		   2.4) 91 나누기 37 */
		   
		   int a0 = 91;
		   int b0 = 37;
		   int c0 = a0 + b0;
		   System.out.println(a0 + " 더하기 " + b0 + " = " + c0);
		   
		   int a1 = 91;
		   int b1 = 37;
		   int c1 = a1 - b1;
		   System.out.println(a1 + " 더하기 " + b1 + " = " + c1);
		   
		   int a2 = 93;
		   int b2 = 37;
		   int c2 = a2 * b2;
		   System.out.println(a2 + " 더하기 " + b2 + " = " + c2);
		   
		   int a3 = 93;
		   int b3 = 37;
		   int c3 = a3 + b3;
		   System.out.println(a3 + " 더하기 " + b3 + " = " + c3);
		   
		   System.out.println("=====문제3=====");
		   
		   /* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
		    출력예시) int a = 10; 의 경우 "10, int"로 출력. */
		   short var1 = 128;
		   String var2 = "B";
		   int var3 = 44032;
		   long var4 = 100000000000L;
		   double var5 = 43.9310;
		   float var6 = 301.3F;
		   System.out.println(var1 + ", short");
		   System.out.println(var2 + ", String");
		   System.out.println(var3 + ", int");
		   System.out.println(var4 + ", long");
		   System.out.println(var5 + ", double");
		   System.out.println(var6 + ", float");
		   
		   int var7 = 128;
		   System.out.printf("%d, int\n", var7);
		   String var8 = "B";
		   System.out.printf("%s, String\n", var8);
		   char var9 = 44032;
		   System.out.printf("%c, char", var9);
		   long var10 = 100000000000L;
		   System.out.printf("%d, long", var10);
		   float var11 = 43.9310F;
		   System.out.printf("%.5f, float", var11);
		   double var12 = 301.3;
		   System.out.printf("%.1f, double", var12);
		   
		   
		   System.out.println("=====문제4=====");
		   
		// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		   byte a = 35;
		   byte b = 25;
		   int c = 463;
		   long d = 1000L;
		   
		   long result1 = a + c + d;
		   System.out.println(result1);
		   
		   int result2 = a + b + c;
		   System.out.println(result2);

		   double e = 45.31;
		   double result3 = c + d + e;
		   System.out.println(result3);	
		   
		   System.out.println("=====문제5=====");
		   
		   
		   /* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		    출력예시) A278번지10.0 
		*/
		    int intValue1 = 24;
		    int intValue2 = 3;
		    int intValue3 = 8;
		    int intValue4 = 10;
		    char charValue = 'A';
		    String strValue = "번지";
		    
		    //System.out.println(charValue + ((intValue1 + intValue2)+ (intValue3 + strValue)) + (float)intValue4);
		    String strResult = String.valueOf(charValue) + (intValue1 + intValue2) + intValue3 + strValue + (double)intValue4;
		    System.out.println(strResult);
		    
		    System.out.println("=====추가문제=====");
		    
		    /* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
			   예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
			   힌트) 변수 3개와 곱하기 연산자(*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		    int value = 485;
		    int value1 = value / 100;
		    int value2 = (value - (value1 * 100)) / 10;
		    int value3 = value - (value2 * 60);
		    int value4 = (value1 + value2 + value3);
		    System.out.println(value4);
	}

}
