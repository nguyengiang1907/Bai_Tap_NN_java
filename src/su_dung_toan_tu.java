import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng :");
        width = sc.nextFloat();
        System.out.println("Nhập chiều cao :");
        height = sc.nextFloat();
        float tong = height*width;
        System.out.println("Diện thích hình chữ nhât là :"+tong);
    }
}
