import java.util.Scanner;

public class Thiet_ke_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 hình chữ nhật ");
        System.out.println("2 hình tam giác vuông ");
        System.out.println("3 hình tma giác ngược");

        System.out.println("Nhập stt in hình :");
        int nhap = sc.nextInt();

        switch (nhap) {
            case 1:
                System.out.println("Hình chữ nhật ");

                System.out.println("Nhập chiều dài  :");
                int chieudai = sc.nextInt();
                System.out.println("Nhập chiều rộng :");
                int chieurong = sc.nextInt();

                for (int i = 0; i <= chieudai; i++) {
                    for (int j = 0; j < chieurong; j++) {

                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;

        }

        switch (nhap) {
            case 2 :
                System.out.println("Hình tam giác vuông ");
                System.out.println("Nhập chiều cao :");
                int chieudai = sc.nextInt();

                for (int i=1 ; i <= chieudai ;i++){
                    for (int j=1 ; j<i ; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                 break;
        }
        switch (nhap){
            case 3:
                System.out.println("Hình tam giác ngược ");
                System.out.println("Nhập chiều cao :");
                int i = sc.nextInt();

                for ( ; i>= 1;i--){
                    for (int j = 1 ; j <= i ; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
