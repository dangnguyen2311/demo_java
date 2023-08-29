package codePTIT;

import java.util.Scanner;

public class DIEM_CAN_BANG {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int t = nhap.nextInt();
		while(t-->0) {
			int n = nhap.nextInt();
			int[] f = new int[n];
			int[] pre = new int[n];
			int tong=0;
			for(int i=0;i<n;i++) {
				f[i] = nhap.nextInt();
				tong+=f[i];
				pre[i]=tong;
			}
			int ans = -1;
			for(int i=2;i<n-1;i++) {
				if(pre[i-1]==pre[n-1]-pre[i]) {
					ans = i+1;
					break;
				}
			}
			System.out.println(ans);
		}
		nhap.close();
	}
}
//2
//7
//-7 1 5 2 -4 3 0
//5
//1 2 3 4 5
