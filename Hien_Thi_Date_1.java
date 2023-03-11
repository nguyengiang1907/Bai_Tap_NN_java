package HDT_Tuan4;

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

    public static class Hien_Thi_Date_2 {
        int day ;
        int moth ;
        int year ;



        public Hien_Thi_Date_2 ( int day , int moth , int year ){
            this.day=day;
            this.moth=moth;
            this.year=year;
        }

        public int  day ()  {
            if (day < 0 || day > 32){
                System.out.println("Ngày không hợp lệ ");
            }
            return day;
        }

        public  int moth () {
            if ( moth == 2 ){
                if (day > 28 ){
                    System.out.println("Tháng 2 không có ngày lớn hơn 28 ");
                }
            }
            return moth ;
        }
        public int year () {
            if ( year < 0  ){
                System.out.println(" Năm không hợp lệ ");
            }
            return year;

        }

    }
}
