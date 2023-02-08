import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần quy đổi :");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền quy đổi :"+ quydoi);

    }
}
