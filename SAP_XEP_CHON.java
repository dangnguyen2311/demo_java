package codePTIT;

import java.util.*;

public class SAP_XEP_CHON {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		int[] f = new int[n+1];
		for(int i=0;i<n;i++) f[i] = nhap.nextInt();
		
		for(int i=0;i<n-1;i++){
			System.out.print("Buoc "+(i+1)+": ");
			int min=i;
			for(int j=i+1;j<n;j++){
				if(f[j]<f[min]){
			    	min=j;
				}
			}
			int t =f[min]; f[min]=f[i]; f[i]=t;
			for (int j=0;j<n;j++)  System.out.print(f[j]+" ");
			System.out.print("\n");
		}
		nhap.close();
	}
}
