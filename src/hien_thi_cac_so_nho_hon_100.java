import java.util.Scanner;

public class hien_thi_cac_so_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số vào đây :");
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int dem = 0;

            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    dem++;
                }
            }
            if (dem==2){
                System.out.print(" " + i);
            }
        }



        }

    }


