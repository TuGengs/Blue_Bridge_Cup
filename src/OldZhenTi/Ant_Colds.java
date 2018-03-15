package OldZhenTi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 长100厘米的细长直杆子上有n只蚂蚁。它们的头有的朝左，有的朝右。
 * 	 每只蚂蚁都只能沿着杆子向前爬，速度是1厘米/秒。
 * 	 当两只蚂蚁碰面时，它们会同时掉头往相反的方向爬行。
 * 	 这些蚂蚁中，有1只蚂蚁感冒了。并且在和其它蚂蚁碰面时，会把感冒传染给碰到的蚂蚁。
 * 	 请你计算，当所有蚂蚁都爬离杆子时，有多少只蚂蚁患上了感冒。
 * 
 * 
 * 接着的一行是n个用空格分开的整数 Xi (-100 < Xi < 100), Xi的绝对值，
 * 表示蚂蚁离开杆子左边端点的距离。
 * 正值表示头朝右，负值表示头朝左，数据中不会出现0值，
 * 也不会出现两只蚂蚁占用同一位置。其中，第一个数据代表的蚂蚁感冒了。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Ant_Colds {
	
	public static Integer[] a;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt(); // 第几只蚂蚁
		
		a = new Integer[n];

		int illness = -1;
		
		for (int i = 0; i < a.length; i++) {
			
			if (i == 0) {
				illness = sc.nextInt();
				a[i] = illness;
				
				continue;
				
			}
			
			a[i] = sc.nextInt();
			
		}
		
		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				int oo1 = Math.abs(o1);
				
				int oo2 = Math.abs(o2);
				
				if (oo1 > oo2) return 1;
				
				if (oo1 < oo2) return -1;
				
				return 0;
				
			}
			
		});
		
		int nums = 1;
		
		int index = -1;
		
		for (int i = 0; i < a.length; i++) 
			if (illness == a[i]) index = i;
		
		if (illness > 0) {
			
			for (int i = index + 1; i < a.length; i++) {
				
				if (a[i] < 0) nums ++;
				
			}
			
			for (int j = 0; j < index; j++) {
				
				if (nums > 1 && a[j] > 0) nums ++;
				
			}
			
		}
		
		if (illness < 0) {
			
//			System.out.println(index + " " + illness);
			
			for (int j = 0; j < index; j++) {
				
				if (a[j] > 0) nums ++;
				
			}
			
			for (int i = index + 1; i < a.length; i++) {
				
				if (nums > 1 && a[i] < 0) nums ++;
				
			}
			
			
		}
		
		
		System.out.println(nums);
		
		
	}

}
