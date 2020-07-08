package com.playground.gugudan;

import java.util.*;
public class Gugudan {

	public static void main(String[] args) {
		
		//라인복사 ctrl + alt + 위아래 화살표
		//라인이동 alt+ 위아래 화살표
//		주석처리 ctrl + /
//		Scanner sc = new Scanner(System.in);
//		int number;
//		System.out.print("구구단 중 출력할 단은? :");
//		number = sc.nextInt();
//		sc.close();
//		System.out.println(number+"단 출력");
//		for(int i= 1; i<10;i++) {
//			System.out.println(number+" * "+ i +" = "+num*i);
//		}
		
		//6단
		int i = 1;
		while(i<10) {
			System.out.println(6*i);
			i++;
		}
		//7단
		for(i = 1; i<10 ; i++) {
			System.out.println(7*i);
		}
	}

}
