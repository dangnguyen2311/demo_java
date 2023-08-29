package codePTIT;
import java.util.Scanner;

public class KIEM_TRA_SO_FIBONACCI{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index=0; index<t; index++){
            long n = nhap.nextLong();
            Solution ans = new Solution();
            if(ans.is_fibonacci_number(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
        nhap.close();
    }
    static class Solution{
        // private double n;
        // private double h;

        // // Constructor với tham số n và h
        // Solution(double n, double h) {
        //     this.n = n;
        //     this.h = h;
        // }
        boolean is_fibonacci_number(long n){
            if(n<=2) {
                return true;
            }
            else{
                long f0=0,f1=1,fn=0;
                while(fn<n){
                    fn=f0+f1;
                    f0=f1;f1=fn;
                }
                if(fn==n) return true;
                else return false;
            }
        }
    }
}