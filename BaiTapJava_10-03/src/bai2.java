import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        ThoiGian tg = new ThoiGian();
        tg.hamTao(0,0,0);
        tg.nhap();
        tg.xuat();
        tg.hamchuyen();
    }
}
class ThoiGian{
    //các thuộc tính giờ, phút và giấy 
    private int gio, phut, giay;
    //biến chuyển đổi giờ phút giây về giây
    int second;
    //hàm tạo với 3 tham số ngầm định
    void hamTao(int gio, int phut, int giay){
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;        
    }
    //hàm nhập để nhập giá trị thời gian
    void nhap(){
        Scanner scan = new Scanner(System.in);
        //Nhập giờ
        System.out.println("Nhập vào giờ là: ");
        gio = scan.nextInt();
        //Nhập phút
        System.out.println("Nhập phút là:");
        phut = scan.nextInt();
        //Nhập giây
        System.out.println("Nhập giây là: ");
        giay = scan.nextInt();
    }
    //hàm xuất ra giá trị x giờ, y phút, z giây
    void xuat(){
        System.out.println("Giá trị thời gian là: "+gio+" giờ, "+phut+ " phút, "+giay+" giây" );
    }
    //hàm chuyển 1 giá trị thời gian giờ phút giây về giây
    void hamchuyen(){
        second = gio*3600 + phut*60 +giay;
        System.out.println("Chuyển đổi giá trị thời gian " +gio+" giờ, " +phut+" phút, "+giay+ "giây ra giây là:"+second+" giây");
    }
    //hàm so sánh hai giá trị thời gian
    /*Nhập vào ds n (0<n<50) giá trị thời gian là 
    khoảng thời gian chạy của n vận động viên.Tìm
    vận động viên chạy nhanh nhất
    */
    //Tính thời gian tb của các vđv
}   

