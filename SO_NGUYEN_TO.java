package codePTIT;
import java.util.Scanner;

public class SO_NGUYEN_TO{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index=0; index<t; index++){
            int n = nhap.nextInt();
            Solution ans = new Solution();
            if(ans.prime_number(n)) System.out.println("YES");
            else System.out.println("NO");
        }


        nhap.close();
    }
    static class Solution{
        boolean prime_number(int n){
            if(n<=1) return false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
}