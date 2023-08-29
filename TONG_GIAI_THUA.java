//import java.text.DecimalFormat;
package codePTIT;

import java.util.Scanner;

public class TONG_GIAI_THUA{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        // int t = nhap.nextInt();
        // while(t-->0){
            int n = nhap.nextInt();
            Solution ans = new Solution(n);
            ans.sum_of_factorials();
            
        // }
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
        // Solution(){
            // khoi tao
        // }
        private int n;
        Solution(int n){
            this.n = n;
        }
        void sum_of_factorials(){
            long sum = 0;
            long tmp = 1;
            for(int i=1;i<=n;i++){
                tmp*=(long)i;
                sum+=tmp;
            }
            System.out.println(sum);
        }
    }
}