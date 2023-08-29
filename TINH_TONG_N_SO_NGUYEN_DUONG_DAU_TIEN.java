package codePTIT;
import java.util.Scanner;

public class TINH_TONG_N_SO_NGUYEN_DUONG_DAU_TIEN{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        for(int i=1;i<=t;i++){
            int n=nhap.nextInt();
            System.out.println( (long) n*(n+1)/2 );
        }

        nhap.close();
    }
}