package codePTIT;

import java.util.Scanner;

public class SAP_XEP_NOI_BOT {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		int[] f = new int[n+1];
		for(int i=0;i<n;i++) f[i] = nhap.nextInt();
		for(int t=0;t<n-1;t++){
			int dem=0;
			for(int j=0;j<n-1;j++){
				if(f[j]>f[j+1]) {
					//doicho(&f[j],&f[j+1]); 
					int tmp = f[j];
					f[j] = f[j+1];
					f[j+1] = tmp;
					dem++;
				}
			}
			if(dem!=0){
				//printf("Buoc %d: ",t+1);
				System.out.print("Buoc "+(t+1)+": ");
				for(int i=0;i<n;i++) System.out.print(f[i]+" ");
				System.out.println();
				
			}
		}
		nhap.close();
	}
}
