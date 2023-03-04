package HDT_Tuan4;

import java.util.Scanner;

public class Temperature_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ c");
        double C = sc.nextDouble();

        if (C > -273) {
                Temperature_2 Temperature = new Temperature_2(C);
                System.out.println("Độ F LÀ : " + Temperature.TemperatureC_F());
                System.out.println("Độ Kenvin LÀ :"+ Temperature.TemperatureC_kenvin());

        } else {
            System.out.println("Số bạn nhập không hợp lí ");
        }


    }
}
