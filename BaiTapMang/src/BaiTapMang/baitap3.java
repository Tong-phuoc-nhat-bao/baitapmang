package BaiTapMang;

import java.util.Scanner;
import java.util.Random;

public class baitap3 {
	public static int[] Take(int n) {
		Random rd = new Random();
		int[] list=new int[n];
		for (int i = 0;i<n;i++) {
			list[i]= rd.nextInt();
		}
		return list;
	}
	public static float[] Take2(int n) {
		Random rd = new Random();
		float[] list=new float[n];
		for (int i = 0;i<n;i++) {
			list[i]= rd.nextFloat(1-0+1);
		}
		return list;
	}
	public static float TBC(int[] list,float[] liss,int n) {
		float tbc=0;
		for (int i=0;i<n;i++) {
			tbc=tbc+list[i]+liss[i];
		}
		tbc=tbc/n;
		return tbc;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("So phan tu cua mang la: ");
		int n = input.nextInt();
		int[] list;
		float[] liss;
		list= Take(n);
		liss=Take2(n);
		float TBC=TBC(list,liss,n);
		System.out.print("trung binh cong cua list la: "+TBC);
	}
}
