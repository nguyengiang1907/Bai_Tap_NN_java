import java.util.Scanner;

public class Lai_suat_ngan_hang {
    public static void main(String[] args) {


        double soluongtienchovay = 1.0;
        double tilelaisuat = 1.0;
       int sothanggui =1;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng tiền cho vay :");
        soluongtienchovay = input.nextDouble();
        System.out.println("Nhập tỉ lệ lãi suất :");
        tilelaisuat = input.nextDouble();
        System.out.println("Nhập số tháng gửi :");
        sothanggui = input.nextInt();

        double sotienlai = 0;
        for (int i = 0 ; i < sothanggui ; i++){
            sotienlai += soluongtienchovay * (tilelaisuat/100) / 12 * sothanggui;


        }
        System.out.println("Số tiền lãi là " + sotienlai);






    }
}
