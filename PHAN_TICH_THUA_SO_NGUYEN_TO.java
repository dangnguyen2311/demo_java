package codePTIT;
import java.util.HashMap;
import java.util.Scanner;

public class PHAN_TICH_THUA_SO_NGUYEN_TO{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int index = 1; index<=t;index++){
            int n = nhap.nextInt();
            HashMap<Integer,Integer> ans = new HashMap<Integer, Integer>();
            int k = (int)Math.sqrt(n);
            for(int i=2;i<k;i++){
                if(n%i==0){
                    while(n%i==0){
                        ans.put(i,ans.getOrDefault(i,0)+1);
                        n/=i;
                    }
                }
                if(n==1) break;
            }
            //if(n>1) ans.put(n,ans.getOrDefault(n,0)+1);
            
            System.out.print("Test "+index+": ");
            for(Integer i: ans.keySet()){
                System.out.print(i+"("+ans.get(i)+") ");
            }
            if(n>1) System.out.print(n+"(1)");
            System.out.println();
        }
        nhap.close();
    }
}