package HDT_Tuan2;

import java.util.Scanner;

public class So_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Mời nhập số");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number  + " không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number  + "  là số nguyên tố ");
            else {
                System.out.println(number  + " Không phải số nguyên tố ");
            }

        }


        
    }
}
