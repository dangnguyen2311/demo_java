package codePTIT;
import java.util.*;

public class TINH_LUY_THUA{
    static long mod = (long) 1e9+7;
    public static void main(String[] args){
        
        Scanner nhap = new Scanner(System.in);
        int t=1;
        while(t>0){
            long a = nhap.nextLong();
            long b = nhap.nextLong();
            if(a==0&&b==0) break;
            else{
                Solution ans = new Solution(a);
                System.out.println(ans.power(b));
            }
        }
        nhap.close();
    }
    static class Solution{
        private long a;
//        private long b;
        Solution(long a){
            this.a = a;
        }
        long power(long b){
            if(b==0) return 1;
            long tmp = power(b/2);
            if(b%2==1){
                return (((tmp*tmp)%mod)*a)%mod;
            }
            else {
                return ((tmp*tmp)%mod);
            }
        }
    }
}