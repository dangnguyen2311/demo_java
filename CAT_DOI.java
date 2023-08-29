package codePTIT;
import java.util.Scanner;

public class CAT_DOI{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        String s = nhap.nextLine();
        while(t-->0){
            s = nhap.nextLine();
            Solution ans = new Solution(s);
            if(ans.check()==false) System.out.println("INVALID");
            else {
                long kq = Long.parseLong(ans.cut_in_haft());
                if(kq==0) System.out.println("INVALID");
                else System.out.println(kq);
            }
        }

        nhap.close();
    }
    static class Solution{
        private String s;
        Solution(String s){
            this.s = s;
        }
        boolean check(){
            for(int i = 0;i < s.length(); i++){
                char si = s.charAt(i);
                if(si!='0' && si!='1' && si!='8' && si!='9') return false;
            }
            return true;
        }
        
        String cut_in_haft(){
            char[] tmp = s.toCharArray();
            for(int i = 0;i < s.length(); i++){
                char si = s.charAt(i);
                if(si=='8' || si=='9') tmp[i] = '0';
            }
            String ans = new String(tmp);
            return ans;
        }
    }
}