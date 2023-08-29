package codePTIT;
import java.util.*;

public class DEM_SO_LAN_XUAT_HIEN {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int t = nhap.nextInt();
		for(int index=1;index<=t;index++) {
			Map<Integer,Integer> m1 = new LinkedHashMap<Integer,Integer>();
			int n = nhap.nextInt();
			for(int i=0;i<n;i++) {
				int k= nhap.nextInt();
				m1.put(k, m1.getOrDefault(k, 0)+1);
			}
			System.out.println("Test "+index+":");
			for(Map.Entry<Integer, Integer> entry : m1.entrySet()) {
				System.out.println(entry.getKey()+" xuat hien "+entry.getValue()+" lan");
			}
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
//2
//10
//1 7 2 8 3 3 2 1 3 2
//17
//17 46 225 2 3 85 12 54 8 3 1 2 5 7 8 463 552
