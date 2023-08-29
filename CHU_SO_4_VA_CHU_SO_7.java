package codePTIT;
import java.util.*;

public class CHU_SO_4_VA_CHU_SO_7{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        // int t = nhap.nextInt();
        // String s = nhap.nextLine();
        // while(t-->0){
            String s = nhap.nextLine();
            Solution ans = new Solution(s);
            if(ans.check()){
                System.out.println("YES");
            }
            else System.out.println("NO");
        //}

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
            for(int i=0;i<s.length();i++){
                if(tmp[i]=='4'||tmp[i]=='7') n++;
            }
            if(n==4||n==7) return true;
            else return false;
        }
    }
}