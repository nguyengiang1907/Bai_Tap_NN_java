package HDT_Tuan4;

public class Min_number_1 {

    public static void main(String[] args) {
     int [] arayNumber = {3,2,4,6,7,9,5};
     int min = arayNumber[0];

      giatrinhonhattrongmang(arayNumber,min);


    }

    public static int  giatrinhonhattrongmang (int number [] , int min ) {
        for (int i = 1; i <number.length ; i++) {
            if (number[i] < min){
               min = number[i];
            }
        }
        System.out.println("Gía trị nhỏ nhất trong mảng " + min);
        return min;
    }
}
