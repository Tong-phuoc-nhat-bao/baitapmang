package BaiTapMang;

import java.util.Scanner;
import java.util.Random;

public class baitap2 {
		public static int[] Take(int n) {
			Random rd = new Random();
			int[] list=new int[n];
			for (int i = 0;i<n;i++) {
				list[i]= rd.nextInt();
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
