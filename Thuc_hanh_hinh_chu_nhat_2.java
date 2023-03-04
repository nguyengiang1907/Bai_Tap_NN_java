package HDT_Tuan4;

public class Thuc_hanh_hinh_chu_nhat_2 {
    int width ;
    int height ;

public Thuc_hanh_hinh_chu_nhat_2(int width , int height){
    this.width = width;
    this.height = height;
 }
 public int dientich(){
    return this.height * this.width;
    }
    public int chuvi (){
    return  (this.height + this.width)*2;
    }
}
