package codePTIT;
import java.util.*;
public class MANG_DOI_XUNG{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-->0){
            int n = nhap.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = nhap.nextInt();
            }
            if(check(a,n)) System.out.println("YES");
            else  System.out.println("NO");
        }
        nhap.close();
    }
    static boolean check(int[] a,int n){
        for(int i=0;i<n/2;i++){
            if(a[i]!=a[n-1-i]) return false;
        }
        return true;
    }
}