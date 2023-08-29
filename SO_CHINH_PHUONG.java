//import java.text.DecimalFormat;
package codePTIT;

import java.util.Scanner;

public class SO_CHINH_PHUONG{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index=0; index<t; index++){
            Solution ans = new Solution();
            int n = nhap.nextInt();
            if(ans.is_square_number(n)==true) System.out.println("YES");
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
        // Solution(){
            // khoi tao
        // }
        boolean is_square_number(int n){
            if(n<=1) return false;
            else{
                double tmp1 = Math.sqrt(n);
                int tmp2 = (int) tmp1;
                if(tmp2*tmp2==n) return true;
                return false;
            }
        }
    }
}