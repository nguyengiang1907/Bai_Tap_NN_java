package HDT_Tuan4;

import java.util.Scanner;

public class Phuong_trinh_bac_2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int a,b,c;
        System.out.println("Nhập a :");
        a = scanner.nextInt();
        System.out.println("Nhập b :");
        b = scanner.nextInt();
        System.out.println("Nhập c :");
        c = scanner.nextInt();
        bac2 number = new bac2(a,b,c);
        if (number.delta() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt :");
            System.out.println("Nghiệm x1 : "+number.getRoot1());
            System.out.println("Nghiệm x2 :"+number.getRoot2());
        } else if (number.delta()==0) {
            System.out.println("Phương trình có 2 nghiệm kép :");
            System.out.println("Nghiệm x1 và x2 :" +number.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }

    }
}
class bac2 {
    int a,b,c;

    public bac2 (int a , int b , int c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double delta(){
        return   (Math.pow(b,2) - (4 * a * c));

    }
    public  double  getRoot(){
        return (Math.pow(b,2) - (2*a*b));
    }
    public double getRoot1(){
        return ((-b)+(Math.pow(delta(),0.5)) / 2*a);
    }
    public double getRoot2(){
        return ((-b)-(Math.pow(delta(),0.5)) / 2*a);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

}
