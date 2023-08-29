package codePTIT;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GIAI_PHUONG_TRINH_BAC_NHAT{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        double a = nhap.nextDouble();
        double b = nhap.nextDouble();
        if(a==0 && b!=0) System.out.println("VN");
        else if(a==0 && b==0) System.out.println("VSN");
        else {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            double ans = -b/a;
            String fans = decimalFormat.format(ans);
            System.out.println(fans);
        }

        nhap.close();
    }
}