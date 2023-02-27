package HDT_Tuan3;

import java.util.Scanner;

public class Tim_gia_tri_lon_trong_mang {
    public static void main(String[] args) {
      int [] numbers = {3,2,3,4,5,6,4,3};
      int max = numbers [0];

        for (int i = 0; i <numbers.length ; i++) {
            if (max < numbers[i]) {
                max = numbers[i];

            }
        }
        System.out.println("Giá trị lớn nhất của mảng là " + max);
    }

}
