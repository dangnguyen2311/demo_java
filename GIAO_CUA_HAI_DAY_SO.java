package codePTIT;
import java.util.*;

public class GIAO_CUA_HAI_DAY_SO {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		int m = nhap.nextInt();
		TreeMap<Integer,Integer> m1 = new TreeMap<Integer, Integer>();
		for(int i=1;i<=n;i++) {
			int k = nhap.nextInt();
			m1.put(k,m1.getOrDefault(k,1));
		}
		for(int i=1;i<=m;i++) {
			int k = nhap.nextInt();
//			m1.put(k, m1.getOrDefault(k,0)+1);
			if(m1.containsKey(k)) {
				m1.remove(k);
				m1.put(k, 2);
			}
		}
		for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            if(entry.getValue()==2) 
            	System.out.print(entry.getKey()+" ");
        }
		nhap.close();
	}
}
//5 6
//1 2 3 4 5
//3 4 5 6 7 8

//10 11
//1 2 3 4 5 6 7 8 9 0
//11 12 13 14 15 16 17 18 19 20 21

//13 17
//1 2 3 4 77 8 5 3 1 4 4 3 2
//17 46 225 2 3 85 12 54 8 3 1 2 5 7 8 463 552