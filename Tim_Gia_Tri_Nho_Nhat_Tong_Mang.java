package HDT_Tuan3;

public class Tim_Gia_Tri_Nho_Nhat_Tong_Mang {
    public static void main(String[] args) {
        int [] numbers = {3,4,5,2,4,7,9,7,};
        int min = numbers [0];

        for (int i = 0; i <numbers.length ; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println("Số nhỏ nhất trong mảng " + min);
    }
}
