package codePTIT;
import java.util.Scanner;

public class TINH_SO_FIBONACCI{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index=0; index<t; index++){
            int n = nhap.nextInt();
            Solution ans = new Solution();
            ans.fibonacci_number(n);
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
        void fibonacci_number(int n){
            if(n<=2) {
                if(n==1) System.out.println(0);
                else System.out.println(1);
            }
            else{
                long f0=0,f1=1,fn=0;
                for(int i=1;i<=n-1;i++){
                    fn=f0+f1;
                    f0=f1;f1=fn;
                }
                System.out.println(fn);
            }
        }
    }
}