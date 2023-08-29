package codePTIT;
import java.math.BigInteger;
import java.util.Scanner;

public class BOI_SO_CHUNG_UOC_SO_CHUNG{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-->0){
            BigInteger a = nhap.nextBigInteger();
            BigInteger b = nhap.nextBigInteger();
            System.out.println( a.multiply(b).divide( a.gcd(b) ) +" "+a.gcd(b));
        }
        nhap.close();
    }
}