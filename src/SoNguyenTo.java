import java.io.FileOutputStream;
import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen to can hien thi: ");
        int number = scanner.nextInt();

        showPrimeNumberWithInputNumber(number);


//        show20Prime();
    }

    private static void showPrimeNumberWithInputNumber(int number){
        int count = 0;
        int i = 2;
        while (count <= number) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }

    }

//    private static void show20Prime() {
//        int count = 0;
//        int i = 2;
//        while (count <= 20) {
//            if (isPrime(i)) {
//                System.out.println(i);
//                count++;
//            }
//            i++;
//        }
//    }

    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }

        return true;
    }
}
