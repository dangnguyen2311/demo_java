package codePTIT;
import java.util.*;

public class SO_LIEN_KE{
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
            //int n=0;
            for(int i=0;i<s.length()-1;i++){
                if(tmp[i+1]-tmp[i]!=1&&tmp[i]-tmp[i+1]!=1) return false;
            }
            return true;
        }
    }
}
// 3
// 123212
// 5654345676
// 10233211123