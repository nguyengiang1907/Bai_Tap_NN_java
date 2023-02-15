import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {

    public static void main(String[] args) {


        System.out.println("20 Số nguyên tố là :");

        double n = 21;
        int count = 0;
        int x = 2;

        while (true){
            if (isNgto(x)){
                System.out.print(x+" ");
                count ++;
            }
            if (count == n){
                break;
            }
            x++;
        }

        }
        public static boolean isNgto(int n) {

            for (int i = 2 ; i < n ;i++){
                if (n % i ==0){
                    return false;
                }
            }
             return true;
        }

    }


