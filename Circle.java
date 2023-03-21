package HDT_Tuan5;

public class Circle {
    private double radius = 1.0;
    private  String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

     protected double getRadius() {
        return radius;
    }
     protected String getArea(){
        return color;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());


        //Thay đổi accses modifier thành protected vẩn in ra kết quả ban đầu
        //Thay đổi accses modifier thành bỏ trống mặc định là defau vẩn ra kết quả đầu
        //Tuy nhiên thay đổi accses modifier thành private kết quả hiện lỗi ở phần gọi đến đối tượng phương thức đó

    }
}
