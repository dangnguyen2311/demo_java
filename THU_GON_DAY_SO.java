package codePTIT;

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class THU_GON_DAY_SO {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		Deque<Integer> q = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++) {
			int k = nhap.nextInt();
			if(q.size()>0) {
				int tmp = q.getFirst();
				if((tmp+k)%2==0) {
					q.removeFirst();
				}
				else {
					q.addFirst(k);
				}
			}
			else {
				q.addFirst(k);
			}
		}
		System.out.println(q.size());
		nhap.close();
	}
}
