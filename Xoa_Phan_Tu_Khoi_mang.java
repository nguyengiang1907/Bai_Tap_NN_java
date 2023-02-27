package HDT_Tuan3;

import java.util.Scanner;

public class Xoa_Phan_Tu_Khoi_mang {
    public static void main(String[] args) {
        int mang [] = {1,3,2,5,4,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử xóa khỏi mảng ");
        int index_del = sc.nextInt();

        for (int x = 0; x < mang.length ; x++) {
           if (index_del == mang [x] ){
               System.out.println( " Phần tử có trong mảng "+mang[x]);
           }else {
               System.out.println("ko");
           }


        }
    }
}
