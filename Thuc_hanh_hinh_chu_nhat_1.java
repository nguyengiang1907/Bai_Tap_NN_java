package HDT_Tuan4;

import java.util.Scanner;

public class Thuc_hanh_hinh_chu_nhat_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng:");
        int width = scanner.nextInt();
        System.out.print("nhập chiều dài:");
        int height = scanner.nextInt();
        Thuc_hanh_hinh_chu_nhat_2 number= new Thuc_hanh_hinh_chu_nhat_2(width, height);
        System.out.println("Diện tích hình chữ nhật :" + number.dientich());
        System.out.println("Chu vi của hình chữ nhật là :" + number.chuvi());
    }


    public static class Thuc_hanh_hinh_chu_nhat_2 {
        int width ;
        int height ;

    public Thuc_hanh_hinh_chu_nhat_2(int width , int height){
        this.width = width;
        this.height = height;
     }
     public int dientich(){
        return this.height * this.width;
        }
        public int chuvi (){
        return  (this.height + this.width)*2;
        }
    }
}