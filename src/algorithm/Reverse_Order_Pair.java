package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * 
 * T 有一颗2n-1个节点的二叉树，它有恰好n个叶子节点，每个节点上写了一个整数。
 * 如果将这棵树的所有叶子节点上的数从左到右写下来，便得到一个序列a[1]…a[n]。
 * 现在想让这个序列中的逆序对数量最少，但唯一的操作就是选树上一个非叶子节点，
 * 将它的左右两颗子树交换。他可以做任意多次这个操作。求在最优方案下，该序列的逆序对数最少有多少。
 * 
 * 
 * 输入格式 第一行一个整数n。 下面每行，一个数x。 如果x=0，表示这个节点非叶子节点，递归地向下读入其左孩子和右孩子的信息，
 * 如果x≠0，表示这个节点是叶子节点，权值为x。
 * 
 * 输出格式 输出一个整数，表示最少有多少逆序对。
 * 
 * 
 * 样例输入 3 0 0 3 1 2 样例输出 1
 * 
 * 数据规模与约定 对于20%的数据，n <= 5000。 对于100%的数据，1 <= n <= 200000，0 <= a[i]<2^31。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Reverse_Order_Pair {

	public static int left[];

	public static int right[];

	public static int len[];

	public static int vals[];

	public static int vTop = 1;
	
	public static int val = -1;

	public static long ans = 0;
	
	public static BufferedReader br;
	
//	public static Scanner sc;

	public static int lRotate(int rt) {
		int nRt = right[rt];
		right[rt] = left[nRt];
		left[nRt] = rt;
		len[nRt] = len[rt];
		len[rt] = len[left[rt]] + len[right[rt]] + 1;
		return nRt;
	}

	public static int rRotate(int rt) {
		int nRt = left[rt];
		left[rt] = right[nRt];
		right[nRt] = rt;
		len[nRt] = len[rt];
		len[rt] = len[left[rt]] + len[right[rt]] + 1;
		return nRt;
	}

	public static int adjust(int rt, boolean isLeft) {
		if (isLeft) {
			if (len[left[left[rt]]] > len[right[rt]] || len[right[left[rt]]] > len[right[rt]]) {
				if (len[right[left[rt]]] > len[right[rt]]) {
					left[rt] = lRotate(left[rt]);
				}
				return rRotate(rt);
			}
		} else {
			if (len[left[right[rt]]] > len[left[rt]] || len[right[right[rt]]] > len[left[rt]]) {
				if (len[left[right[rt]]] > len[left[rt]]) {
					right[rt] = rRotate(right[rt]);
				}
				return lRotate(rt);
			}
		}
		return rt;
	}

	public static int insert(int rt, int node) {
		len[rt]++;
		if (vals[node] < vals[rt]) {
			if (left[rt] == 0) {
				left[rt] = node;
			} else {
				left[rt] = insert(left[rt], node);
			}
		} else {
			if (right[rt] == 0) {
				right[rt] = node;
			} else {
				right[rt] = insert(right[rt], node);
			}
		}
		return adjust(rt, vals[node] < vals[rt]);
	}

	public static int rank(int rt, int val) {
		if (rt == 0) {
			return 0;
		} else if (val >= vals[rt]) {
			return rank(right[rt], val);
		} else {
			return rank(left[rt], val) + 1 + len[right[rt]];
		}
	}

	public static int merge(int des, int vBegin, int vEnd)  
	 {  
	     long ca = 0, cb = 0;  
	     int i;  
	     for(i = vBegin; i < vEnd; i++)  
	     {  
	         ca += rank(des, vals[i]);  
	         cb += len[des] - rank(des, vals[i] - 1);  
	     }  
	     ans += ca < cb ? ca : cb;  
	     for(i = vBegin; i < vEnd; i++)  
	     {  
	         left[i] = right[i] = 0;  
	         len[i] = 1;  
	         des = insert(des, i);  
	     }  
	     return des;  
	 }

	public static int buildTree() throws Exception {
		
		val = Integer.valueOf(br.readLine());
		
//		val = sc.nextInt();

		if (val != 0) {
			left[vTop] = right[vTop] = 0;
			len[vTop] = 1;
			vals[vTop] = val;
			return vTop++;
		}

		int ls = vTop;
		int rlt = buildTree();
		int rs = vTop;
		int rrt = buildTree();
		int re = vTop;

		if (rs - ls > re - rs) {
			return merge(rlt, rs, re);
		} else {
			return merge(rrt, ls, rs);
		}

	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));

		Integer a = Integer.valueOf(br.readLine());
		
//		sc = new Scanner(System.in);
		
//		Integer a = sc.nextInt();
		
		a = 2 * a;
		
		left = new int[a];

		right = new int[a];

		len = new int[a];

		vals = new int[a];
		
		buildTree();
		
		System.out.println(ans);
		
		
	}
	

}
