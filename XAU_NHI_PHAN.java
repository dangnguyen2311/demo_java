package codePTIT;
import java.util.*;
public class XAU_NHI_PHAN{
    // public static void day_fibo(){
    //     long[] fib = new long[93];
    //     fib[1]=0; fib[2]=1;
    //     for(int i=3;i<93;i++){
    //         fib[i]=fib[i-1]+fib[i-2];
    //     }
    // }
    public static void main(String[] args){
        long[] fib = new long[93];
        fib[1]=1; fib[2]=1;
        for(int i=3;i<92;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-->0){
            int n = nhap.nextInt();
            long k = nhap.nextLong();
            Solution ans = new Solution();
            System.out.println(ans.kq(fib,n,k));
        }
        nhap.close();
    }
    static class Solution{
        // private int n;
        // private long k;
        // Solution(int n, long k){
        //     this.n = n;
        //     this.k = k;
        // }
        int kq(long[] fib,int n,long k){
            if(n==1) return 0;
            if(n==2) return 1;
            if(k>fib[n-2]){
                return kq(fib,n-1,k-fib[n-2]);
            }
            else return kq(fib, n-2, k);
        }

    }
}