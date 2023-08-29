package codePTIT;
import java.util.*;

public class UOC_SO_CHIA_HET_CHO_2{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-->0){
            int n = nhap.nextInt();
            Solution ans = new Solution(n);
            ans.doing();
        }
        nhap.close();
    }
    static class Solution{
        private int n;
        Solution(int n){
            this.n = n;
        }
        void doing(){
            int cnt = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    if(i%2==0) cnt++;
                    if((n/i)%2==0) cnt++;
                    if(i*i==n&&n%2==0) cnt--;
                }
            }
            if(n%2==0) cnt++;
            System.out.println(cnt);
        }
    }
}