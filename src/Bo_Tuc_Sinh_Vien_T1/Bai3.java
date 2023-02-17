package Bo_Tuc_Sinh_Vien_T1;

public class Bai3 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i <=number ; i++) {
            if (i%2==0){
                if (i == 4){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
