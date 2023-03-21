package HDT_Tuan5;

import javax.print.attribute.standard.MediaSize;

public class Car {
    private String name;
    private String engine;


    public static int NumberOfCas;

    public Car(String name , String engine){
        this.name= name;
        this.engine=engine;
        NumberOfCas++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumberOfCas() {
        return NumberOfCas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void setNumberOfCas(int numberOfCas) {
        NumberOfCas = numberOfCas;
    }
}
class TestStaticPropenty{
    public static void main(String[] args) {
        Car car = new Car("Mazda 3","Skyactiv");
        System.out.println(Car.NumberOfCas);
        Car car1 = new Car("Mazda 6 " , "Skyactiv");
        System.out.println(car1.NumberOfCas);

    }
}
