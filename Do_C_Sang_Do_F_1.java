package HDT_Tuan4;

import java.util.Scanner;

public class Do_C_Sang_Do_F_1 {
    public static void main(String[] args) {


        Do_C_Sang_Do_F_2 chuyen = new Do_C_Sang_Do_F_2(25,30);

        System.out.println("Chuyên từ đọ f sang độ c là : " + chuyen.Chuyentudofsangdoc());
        System.out.println("Chuyển từ độ c sang độ f là : " + chuyen.Chuyentudoccsangdof());





    }

    public static class Do_C_Sang_Do_F_2 {
        double  celsius ;
        double fahrenheit;

        public Do_C_Sang_Do_F_2 (double celsius , double fahrenheit ) {
            this.celsius=celsius;

            this.fahrenheit=celsius;
        }
        public double Chuyentudofsangdoc (){ celsius = (5.0 / 9) * (fahrenheit - 32 ); return celsius;}
        public double Chuyentudoccsangdof (){ fahrenheit = (9.0 / 5) * (celsius + 32) ; return fahrenheit;}
    }
}
