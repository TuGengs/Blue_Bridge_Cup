package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 压状bfs
 * 
 * @author tugeng
 *
 */
public class Five {
	
	static String mat[] = {
			
					"0......9..",
					"...X..0...",
					".X..8..X..",
					".7...X..6.",
					".X..5.X...",
					"..X....X..",
					".....X..3.",
					".X.X..1...",
					".4....XX..",
					"..X..X2..."
		
	};

	static int d[][][];
	
	static int dir[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	
	static class Node {
		
		int x, y, s;

		public Node(int x, int y, int s) {
			this.x = x;
			this.y = y;
			this.s = s;
		}
		
	}
	
	static boolean in (int x, int y) {
		
		if (x >= 0 && x < 10 && y >= 0 && y < 10) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	static void bfs() {
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(new Node(0, 0, 0));
		
		d[0][0][0] = 0;
		
		while (!q.isEmpty()) {
			
			int x = q.peek().x;
			
			int y = q.peek().y;
			
			int s = q.peek().s;
			
			q.poll();
			
			for (int i = 0; i < 4; i++) {
				
				int tx = x + dir[i][0];
				
				int ty = y + dir[i][1];
				
				int ts = s;	// 0
				
				if (in(tx, ty)) {
					
					if (0 <= (mat[tx].charAt(ty) - '0') && (mat[tx].charAt(ty) - '0') <= 9) {
						
						ts = s | (1 << (mat[tx].charAt(ty) - '0'));
						
					}
					
					if (d[tx][ty][ts] == -1) {
						
						d[tx][ty][ts] = d[x][y][s] + 1;
						
						q.add(new Node(tx, ty, ts));
						
					}
					
				}
				
				
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		d = new int[11][11][1 << 10];
		
		for (int i = 0; i < d.length; i++) {
			
			for (int j = 0; j < d[0].length; j++) {
				
				for (int k = 0; k < d[0][0].length; k++) {
					
					d[i][j][k] = -1;
					
				}
				
			}
			
		}
		
		bfs();
		
		System.out.println(d[0][0][(1 << 10) - 1]);		// 42
		
	}
	
}
