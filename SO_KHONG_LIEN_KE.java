package codePTIT;
import java.util.*;

public class SO_KHONG_LIEN_KE{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        String s = nhap.nextLine();
        while(t-->0){
            s = nhap.nextLine();
            Solution ans = new Solution(s);
            if(ans.check()){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

        nhap.close();
    }
    static class Solution{
        private String s; // String: token_based
        Solution(String s){
            this.s = s;
        }
        boolean check(){
            char tmp[] = s.toCharArray();
            int n=0;
            for(int i=0;i<s.length()-1;i++){
                n+=(int)(tmp[i]-'0');
                if(tmp[i]-tmp[i+1]!=2&&tmp[i+1]-tmp[i]!=2) return false;
            }
            n+=(int)(tmp[s.length()-1]-'0');
            //System.out.println(n);
            if(n%10==0) return true;
            else return false;
        }
    }
}
// 3
// 1353
// 246864
// 123435

//11 15 39