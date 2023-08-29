package codePTIT;

import java.util.Scanner;


public class BOI_SO_NHO_NHAT_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
	public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		long[] f = new long[10005];
		f[1]=1; f[2]=2;
		for(int i=3;i<10005;i++) {
			f[i]=(i*f[i-1])/(gcd(f[i-1],i));
		}
		int t = nhap.nextInt();
		while(t-->0) {
			int n = nhap.nextInt();
			System.out.println(f[n]);
		}
		
		nhap.close();
	}
}
