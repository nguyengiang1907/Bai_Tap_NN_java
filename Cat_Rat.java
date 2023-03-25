package HDT_Tuan5;

public class Cat_Rat {
    public static void main(String[] args) {
        Rat rat = new Rat("Chuột",10,5,true);
        Cat cat = new Cat("Mèo",20,10,rat);

        System.out.println(cat.sounding());
        System.out.println(rat.sounding() );
        cat.Bat(rat);
        cat.Eat(rat);
    }
}
class Rat{
    private String name;
     public int mass_rat;
    public int speed;
    public boolean status;



    public Rat(String name , int mass_rat , int speed , boolean status){
        this.name=name;
        this.mass_rat=mass_rat;
        this.speed=speed;
        this.status=status;
    }

    public int getMass() {
        return mass_rat;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void isStatus() {
        if (status) {
            System.out.println("Chuột còn sống");
        }else {
            System.out.println("Chuột đã chết");
        }
    }
    public void Die(){
     this.status=false;
    }
    public void Live(){
        this.status=true;
    }
    public String sounding(){
        return "Chít chít";
    }
}
class Cat{

    private String name;
    public int mass_cat;
    public int maxSpeed;
    public Rat Rat;


    public Cat(String name , int mass_cat ,int maxSpeed, Rat rat){
        this.name=name;
        this.mass_cat=mass_cat;
        this.maxSpeed=200;
        this.Rat=rat;


    }
    public String sounding(){
        return "Meo meo";
    }
    public void Bat(Rat rat){
    if (this.maxSpeed > this.Rat.speed ){
        System.out.println("Mèo đã bắt được chuột");
    }else {
        System.out.println("Mèo không bắt được chuột");
    }
    }
    public void Eat(Rat rat){
        if (rat.status) {
            this.mass_cat=this.mass_cat + rat.mass_rat;
            rat.Die();
            System.out.println("Chuột đã bị mèo thịt ");
            System.out.println("Cân nặng của mèo "+this.mass_cat);
        }else {
            System.out.println("Chuột đã đi về nơi chín suối ");
        }
    }
}

