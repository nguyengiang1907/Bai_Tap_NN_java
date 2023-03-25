package HDT_Tuan5;

public class Apple {
  private int weight = 10;
  public Apple(){
  }
  public void decrease(){
    this.weight--;
  }
  public boolean isEmpty(){
      return true;
  }
    public int getWeight() {
        return weight;
    }
}
class Human{
    private String name;
    private boolean gender;
    private int weight_Human;

    public Human( String name , boolean gender , int weight_Human ){
        this.name=name;
        this.gender=gender;
        this.weight_Human=weight_Human;
    }
    public boolean isMale(){
        return true;
    }
    public boolean isFemale(){
        return false;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public boolean checkApple(Apple apple){
        if (apple.getWeight() > 0 ) {
            System.out.println("Khối lượng hiện tại của quả táo "+apple.getWeight());
        }else {
            System.out.println("Đã ăn hết ");
        }
        return true;
    }
    public void eat(Apple apple){
        if (apple.getWeight()>0) {
            System.out.println(name +" : Đã cắn 1 miếng ");
            apple.decrease();
            weight_Human++;
        }
    }
    public void say(String word){
        System.out.println(name + ":" +word);
    }

    public String getName() {
        return name;
    }

    public int getWeight_Human() {
        return weight_Human;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight_Human(int weight_Human) {
        this.weight_Human = weight_Human;
    }
}
class show{
    public static void main(String[] args) {
        Apple apple1 = new Apple();

        Human Adam = new Human("Adam",true,100);
        Human Eva = new Human("Eva" , false,100);
        Eva.say("Ăn táo không anh zai ơi");
        Adam.say("Mút em ơi");
        while (apple1.getWeight() > 0){
            Adam.eat(apple1);
            System.out.println( "Cân nặng của Adam sau khi ăn là : "+ Adam.getWeight_Human() );
            Eva.eat(apple1);
            System.out.println("Cân nặng của Eva sau khi ăn là :"+Eva.getWeight_Human());
        }
        System.out.println("Còn cái nịt");
        System.out.println("Hết chuyện");

    }
}

