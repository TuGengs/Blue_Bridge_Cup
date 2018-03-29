package OldZhenTi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class The_Common_Denominator_Of_The_Game {
    
    public int dfs(int[] numA, ArrayList<Integer>[] listA, int start) {
    	
        for(int i = listA[start].size() - 1;i >= 0;i--) {

            if(numA[listA[start].get(i)] > 0) {

                numA[listA[start].get(i)]--;

                int t = dfs(numA, listA, listA[start].get(i));

                numA[listA[start].get(i)]++;

                if(t == -1)
                	return 1;

            }
            
        }
        
        return -1;
        
    }
    
    public void getResult(String A, String B) {
        int[] numA = new int[105];
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] listA = new ArrayList[105];
        for(int i = 1;i < 105;i++)
            listA[i] = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        
        for(int i = 0;i < arrayA.length;i++) {
            int a = Integer.valueOf(arrayA[i]);
            numA[a]++;
        }
        
        for(int i = 1;i <= 100;i++) {
            if(numA[i] != 0) {
                numA[i]--;
                for(int j = 1;j <= 100;j++)
                    if(numA[j] != 0 && (i % j == 0 || j % i == 0))
                        listA[i].add(j);
                numA[i]++;
            }
        }
        
        for(int i = 0;i < arrayB.length;i++) {
            int b = Integer.valueOf(arrayB[i]);
            listB.add(b);
        }
        
        Collections.sort(listB);
        
        for(int i = 0;i < listB.size();i++) {
            numA[listB.get(i)]--;
            int t = dfs(numA, listA, listB.get(i));
            numA[listB.get(i)]++;
            if(t == -1) {
                System.out.println(listB.get(i));
                return;
            }
        }
        System.out.println("-1");
        return;
    }
    
    public static void main(String[] args) {
    	The_Common_Denominator_Of_The_Game test = new The_Common_Denominator_Of_The_Game();
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        test.getResult(A, B);
    }
}