package HDT_Tuan4;

public class Mobile {
    public static void main(String[] args) {
        Mobile2 mobile = new Mobile2(64);
        System.out.println("Pin của điện thoại : "+mobile.pin + "%");
    }

    public static class Mobile2 {
        int pin;

        public Mobile2 (int pin){
            this.pin=pin;
        }

        public int pin (int pin ){
            if (pin >= 100){
                System.out.println(pin);
            } else {
                System.out.println("Không hợp lệ ");
            }


            return pin;
        }


    }
}
