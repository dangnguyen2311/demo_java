package codePTIT;
import java.util.*;
public class HINH_VUONG{
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int x1,x2,x3,x4;
        int y1,y2,y3,y4;
        x1 = nhap.nextInt();
        y1 = nhap.nextInt();
        x2 = nhap.nextInt();
        y2 = nhap.nextInt();
        x3 = nhap.nextInt();
        y3 = nhap.nextInt();
        x4 = nhap.nextInt();
        y4 = nhap.nextInt();
        // long tmp1 = 0;
        // tmp1 = (long) Math.max(Math.abs(x2-x3), Math.abs(y4-y1));
        // long tmp2 = 0;
        // tmp2 = (long) Math.max(Math.abs(x1-x2), Math.abs(x3-x4));
        // long tmp3 = 0;
        // tmp3 = (long) Math.max(Math.abs(y1-y2), Math.abs(y3-y4));
        // long ans = Math.max(tmp1, Math.max(tmp2,tmp3));
        int tmp1 = Math.min(x1,Math.min(x2,Math.min(x3,x4)));
        int tmp2 = Math.min(y1,Math.min(y2,Math.min(y3,y4)));
        int tmp3 = Math.max(x1,Math.max(x2,Math.max(x3,x4)));
        int tmp4 = Math.max(y1,Math.max(y2,Math.max(y3,y4)));
        long ans = Math.max(tmp3-tmp1, tmp4-tmp2);
        System.out.print(ans*ans);
        nhap.close();
    }
}
// 6 6 8 8
// 1 8 4 9