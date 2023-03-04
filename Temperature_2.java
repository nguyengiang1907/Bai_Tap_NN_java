package HDT_Tuan4;

public class Temperature_2 {
//    b1 Khai báo các biến độ
    double C ;



    public Temperature_2 (double C ){

        this.C=C;

    }

    public double TemperatureC_F (){
        double F;
        F = (9.0 / 5) * (C + 32 ) ; return  F;}
    public double TemperatureC_kenvin (){
        double kenvin ;
        kenvin = (C + 273.15);return kenvin;}
}
