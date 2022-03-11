package BaiTapMang;

import java.util.Scanner;

public class baitap {
	public static int[] Take(int n) {
		Scanner input = new Scanner(System.in);
		int[] list=new int[n];
		for (int i = 0;i<n;i++) {
			System.out.print("Phan tu thu "+(i+1)+" la: ");
			list[i]= input.nextInt();
		}
		return list;
	}
	public static float TBC(int[] list,int n) {
		float tbc=0;
		for (int i=0;i<n;i++) {
			tbc=tbc+list[i];
		}
		tbc=tbc/n;
		return tbc;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("So phan tu cua mang la: ");
		int n = input.nextInt();
		int[] list;
		list= Take(n);
		float TBC=TBC(list,n);
		System.out.print("trung binh cong cua list la: "+TBC);
	}
}
