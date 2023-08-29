package codePTIT;
import java.util.*;

public class TONG_UOC_SO_1{
    public static void main(String[] args){
        int[] prime = new int[2000008];
        //Arrays.fill(prime,1);
        //prime[1]=0;
        for(int i=2;i*i<=2000007;i++){
            if(prime[i]==0){
                for(int j=i;j<=2000007;j+=i){
                    if(prime[j]==0) prime[j]=i; // chua luu uoc thi moi luu
                }
            }
        }
        for(int i=1001;i<=2000007;i++){ // Luu uoc nho nhat 
            if(prime[i]==0) prime[i]=i;
        }
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        long tong = 0;
        while(t-->0){
            int n = nhap.nextInt();
            Solution ans = new Solution(n);
            tong=tong+(long)ans.tong_uoc(prime);
        }
        System.out.println(tong);
        nhap.close();
    }
    static class Solution{
        private int n;
        Solution(int n){
            this.n = n;
        }
        int tong_uoc(int[] prime) {
            int tmp = 0;
            if (prime[n] == 0) return n;
            else {
                while(n!=1){
                    tmp+=prime[n];
                    n/=prime[n];
                    
                }
                
            }return tmp;
        }
    }
}
// 5 
// 7
// 9 
// 10 
// 13 
// 100