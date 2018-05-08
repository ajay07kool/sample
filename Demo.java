package com.alacriti.demo.test;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		int min = 0;
		int max = 4;
		Random rand = new Random();
		int num = rand.nextInt(max);
		String arr[] = { "abc", "def", "ghi", "jkl", "mno" };

		System.out.println(arr[num]);

	}
}
