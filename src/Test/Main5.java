package Test;


import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	static int N, max = 10010;
	static boolean[] vis = new boolean[max];
	static int[] a;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = in.nextInt();
		Arrays.sort(a);
		for (int i = 0; i < N; i++)
			for (int j = a[i]; j < max; j += a[i]) {
				vis[j] = true;
				for (int k = 0; k < N; k++) {
					if (j + a[k] >= max)
						break;
					vis[j + a[k]] = true;
				}
			}
		for (int i = 1; i < max; i++) {
			if (!vis[i])
				continue;
			for (int j = 1; j < max; j++) {
				if (!vis[j])
					continue;
				if (i + j < max)
					vis[i + j] = true;
			}
		}
		int count = 0;
		int flag = 0;
		for (int i = 1; i < max; i++) {
			if (vis[i])
				flag++;
			if (flag == a[0]) {
				System.out.println(count);
				return;
			}
			if (!vis[i]) {
				count++;
				flag = 0;
			}
		}
		System.out.println("INF");
	}
}
