package com.playground.gugudan;

import java.util.*;
public class Gugudan {

	public static void main(String[] args) {
		
		//���κ��� ctrl + alt + ���Ʒ� ȭ��ǥ
		//�����̵� alt+ ���Ʒ� ȭ��ǥ
//		�ּ�ó�� ctrl + /
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("������ �� ����� ����? :");
		number = sc.nextInt();
		sc.close();
		System.out.println(number+"�� ���");
		for(int i= 1; i<10;i++) {
			System.out.println(number+" * "+ i +" = "+num*i);
		}
		
		
	}

}
