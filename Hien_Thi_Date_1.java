package HDT_Tuan4;

import java.awt.*;
import java.util.Scanner;

public class Hien_Thi_Date_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày ");
        int day = sc.nextInt();
        System.out.println("Nhập tháng ");
        int moth = sc.nextInt();
        System.out.println("Nhập năm ");
        int year = sc.nextInt();

        Hien_Thi_Date_2 Date = new Hien_Thi_Date_2(day , moth , year );
        System.out.println( Date.day() + "/" + Date.moth() + "/" + Date.year() );
        if (day == 8 && moth == 3 ){
            System.out.println(" Ngày quốc tế phụ Nữ ");
        }


    }

}
