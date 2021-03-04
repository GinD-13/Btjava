import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
        //sử dụng hàm tạo
        SanPham sp3 = new SanPham(tenSp,donGia);
    }
    public class SanPham{
        //khai báo biến
        private String tenSp;
        private double donGia,giamGia;
        private double ThueNhapKhau;
        //tạo hàm getter 
        public String gettenSp(){
            return this.tenSp;
        }
        public double getdonGia(){
            return this.donGia;
        }
        public double getgiamGia(){
            return this.giamGia;
        }
        //tạo hàm setter
        public void settenSp(String tenSp){
            this.tenSp = tenSp;
        }
        public void setdonGia(double donGia){
            this.donGia = donGia;
        }
        public void setgiamGia(double giamGia){
            this.giamGia = giamGia;
        }
        //hàm nhap()
        void nhap(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhập vào tên sản phẩm là: ");
            tenSp = scan.nextLine();
            System.out.println("Nhập vào đơn giá là: ");
            donGia = scan.nextDouble();
            System.out.println("Nhập vào giảm giá là: ");
            giamGia = scan.nextDouble();
        }
        //hàm tính thuế nhập khẩu
        private getThueNhapKhau(){
            return ThueNhapKhau=donGia*10; 
        }
        //hàm xuất()
        public xuat(){
            System.out.println("Tên sản phẩm là: "+tenSp);
            System.out.println("Đơn giá là: "+donGia);
            System.out.println("Giảm giá là: "+giamGia);
            System.out.println("Thuế nhập khẩu là: "+ThueNhapKhau);
        }
        //hàm tạo
        public SanPham(String tenSp,double donGia,double giamGia){
            this.tenSp = tenSP;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }
        //hàm tạo
        public SanPham(String tenSp,double donGia){
            this(tenSP,donGia,0);
        }
    }
}
