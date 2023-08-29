package codePTIT;
import java.math.BigInteger;

public class LCMAndGCD {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12"); // Số nguyên a
        BigInteger b = new BigInteger("18"); // Số nguyên b

        // Tính ước chung lớn nhất (GCD)
        BigInteger gcd = a.gcd(b);
        System.out.println("Ước chung lớn nhất (GCD) của " + a + " và " + b + " là: " + gcd);

        // Tính bội chung nhỏ nhất (LCM)
        BigInteger lcm = a.multiply(b).divide(gcd);
        System.out.println("Bội chung nhỏ nhất (LCM) của " + a + " và " + b + " là: " + lcm);
    }
}
