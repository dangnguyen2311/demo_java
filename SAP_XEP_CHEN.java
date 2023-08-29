package codePTIT;

import java.util.Scanner;

public class SAP_XEP_CHEN {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		int[] f = new int[n+1];
		for(int i=0;i<n;i++) f[i] = nhap.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Buoc "+i+": ");
//			int f[i] = f[i];
			for(int j=0;j<i;j++) {
				if(f[j]>f[i]) {
					int tmp = f[i];
					f[i] = f[j];
					f[j] = tmp;
				}
			}
			
			for(int j=0;j<=i;j++) System.out.print(f[j]+" ");
			System.out.println();
		}
		nhap.close();
	}
}
