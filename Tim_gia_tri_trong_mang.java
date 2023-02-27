package HDT_Tuan3;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String students[] = {"Giang", "Nguyên", "Tĩnh", "Hà", "Hiệu", "Nam", "Khánh", "Việt", "Anh Cấn", "Trúc","Hùng"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên sinh viên :");
        String input_name = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của phần tử " + input_name + " Là " + i);
               isExist = true;
               break;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại " + input_name + " Trong mảng ");

        }
    }
}
