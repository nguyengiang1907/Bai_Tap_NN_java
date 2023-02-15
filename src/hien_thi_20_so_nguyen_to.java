import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số vào đây");

        double numbers = sc.nextDouble();
        int count = 0;
        for (int i = 2; i < Math.sqrt(numbers);i++)
            if (numbers % i ==0){
                break;
            }
    }

}
