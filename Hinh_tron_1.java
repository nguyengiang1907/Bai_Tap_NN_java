package HDT_Tuan4;

public class Hinh_tron_1 {
    public static void main(String[] args) {
        Hinh_tron_2 Number = new Hinh_tron_2(2);
        System.out.println(Number.dientich());

    }

    public static class Hinh_tron_2 {
       double radius ;
       public Hinh_tron_2 (double radius ){
           this.radius = radius;
       }
       public double dientich (){
           return Math.PI * radius * radius;
       }
    }
}
