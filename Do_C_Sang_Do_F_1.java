package HDT_Tuan4;

import java.nio.channels.SeekableByteChannel;
import java.util.Scanner;

public class Do_C_Sang_Do_F_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;



        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius ");
            System.out.println("2.Celsius to Fahrenheit ");
            System.out.println("0.Exit");
            System.out.println("Nhập ");
            choice= sc.nextInt();


            switch (choice){
                case 1 : {
                    System.out.println("Enter fahrenheit : ");
                    fahrenheit = sc.nextDouble();
                    System.out.println(Chuyentudofsangdoc(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Enter celsius : ");
                    celsius = sc.nextDouble();
                    System.out.println(Chuyentudoccsangdof(celsius));
                }
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);

    }
    public static double Chuyentudoccsangdof (double fahrenheit ){  double celsius = (5.0 / 9) * (fahrenheit - 32 ); return celsius;}
    public static double Chuyentudofsangdoc (double celsius ){ double fahrenheit = (9.0 / 5) * (celsius + 32) ; return fahrenheit;}


    }

