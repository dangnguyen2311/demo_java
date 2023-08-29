package codePTIT;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CHIA_TAM_GIAC{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index=0; index<t; index++){
            double n = nhap.nextDouble();
            double h = nhap.nextDouble();
            Solution ans = new Solution();
            ans.devide_triangle(n,h);
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
        void devide_triangle(double n, double h){
            for(int i=1;i<=n-1;i++){
                double tmp = Math.sqrt(i/n);
                tmp*=h;
                DecimalFormat decimal_format = new DecimalFormat("0.000000");
                String fans = decimal_format.format(tmp);
                System.out.print(fans+" ");
            }
            System.out.println();
        }
    }
}
// 2
// 3 2
// 2 100000