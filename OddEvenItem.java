package com.alacriti.demo.test;

import java.util.Scanner;

public class OddEvenItem {
	
	public static void main(String []args){
		
		int arr[] = {5,3,8,6,3,4};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i =0 ; i < arr.length; i=i+2){
			if(num==arr[i]){
				flag = true;
			}else{
				flag = false;
			}
			
		}
		if(flag==true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
