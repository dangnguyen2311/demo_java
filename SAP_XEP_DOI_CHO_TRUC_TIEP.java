package codePTIT;

import java.util.*;

public class SAP_XEP_DOI_CHO_TRUC_TIEP {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		int[] f = new int[n+1];
		for(int i=0;i<n;i++) {
			f[i]=nhap.nextInt();
		}
		for(int t = 0;t<n-1;t++) {
			System.out.print("Buoc "+(t+1)+": ");
			for(int k=0;k<=t;k++) {
				for(int j=t+1;j<n;j++) {
					if(f[k]>f[j]) {
						int tmp=f[k];
						f[k]=f[j];
						f[j]=tmp;
					}
				}
			}
			for(int i=0;i<n;i++) System.out.print(f[i]+" ");
			System.out.println();
		}
//		for(int t=0;t<n-1;t++){
//			printf("Buoc %d: ",t+1);
//			for(int k=t;k<=t;k++){
//				for(int j = t+1; j<n; j++ ) {
//					if(a[k]>a[j]){
//						doicho(&a[k],&a[j]);
//					}
//				}
//			}
//			for(i=0;i<n;i++) printf("%d ",a[i]);
//			printf("\n");
//		}
		nhap.close();
	}
}
