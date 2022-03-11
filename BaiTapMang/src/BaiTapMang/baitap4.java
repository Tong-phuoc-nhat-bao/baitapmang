package BaiTapMang;

import java.util.Scanner;
import java.util.Random;

public class baitap4 {
	public static int[] Take(int n) {
		Random rd = new Random();
		int[] list=new int[n];
		for (int i = 0;i<n;i++) {
			list[i]= rd.nextInt();
		}
		return list;
	}
	public static void LTR(int[] list,int n) {
		for (int i=0;i<n;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println("");
	}
	public static void RTL(int[] list,int n) {
		for (int i=n-1;i>=0;i--) {
			System.out.print(list[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("So phan tu cua mang la: ");
		int n = input.nextInt();
		int[] list;
		list= Take(n);
		LTR(list,n);
		RTL(list,n);
	}
}
