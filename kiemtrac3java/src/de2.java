import java.util.Scanner;
public class de2{
    ChiTietPhieuNhap ttchitietphieunhap = new ChiTietPhieuNhap);
    Scanner dcan = new Scanner(System.in);
    System.out.println("Nhap don hang la: \n");
    int arry[] = new int[3];
}
//xây dựng lớp nhà cung cấp
public abstract class NhaCungCap implements xuattt, nhaptt {
//các thuộc tính
    int ma_nhacungcap;
    String ten_nhacungcap;
    String diachi;
//Các phương thức
    //phương thức nhập thông tin
    @Override
    public void nhapthongtin_nhacungcap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin nha cung cap la: \n");
        //Nhập mã nhà cung cấp
        System.out.println("Nhap ma nha cung cap la: \n");
        ma_nhacungcap = scan.nextInt();
        //Nhập tên nhà cung cấp
        System.out.println("Nhap ten nha cung cap la: \n");
        ten_nhacungcap = scan.nextLine();
        //Nhập địa chỉ nha cung cấp
        System.out.println("Nhap dia chi la: \n");
        diachi = scan.nextLine();
    }
    //phương thức xuất thông tin
    @Override
    public void xuatthongtin_nhacungcap(){
        System.out.println("Thong tin nha cung cap la: \n" );
        System.out.println("Ma nha cung cap la: "+ma_nhacungcap);
        System.out.println("Ten nha cung cap la: "+ten_nhacungcap);
        System.out.println("Dia chi nha cung cap la "+diachi);
    }
};
//thiết kế ct sử dụng interface
interface xuattt{
    void nhapthongtin_nhacungcap();
}
interface nhaptt{
    void xuatthongtin_nhacungcap();
}
//Xây dựng lớp phiếu nhập
class PhieuNhap{
//các thuộc tính
    int ma_phieunhap;
    String ngaynhap;
    String ten_nhanvien;
//các phương thức
    //phuwing thức nhập thông tin
    void nhapthongtin_phieunhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin phieu nhap la: \n");
        System.out.println("Nhap ma phieu nhap la: \n");
        ma_phieunhap = scan.nextInt();
        System.out.println("Nhap ngay nhap la: \n");
        ngaynhap = scan.nextLine();
        System.out.println("Nhap ten nhan vien la: \n");
        ten_nhanvien = scan.nextLine();
    }
    //Phương thức xuất thông tin
    void xuatthongtin_phieunhap(){
        System.out.println("Xuat thong tin phieu nhap la: \n");
        System.out.println("Ma phieu nhap la: \n"+ma_phieunhap);
        System.out.println("Ngay nhap la: \n"+ngaynhap);
        System.out.println("Ten nhan vien la: \n"+ten_nhanvien);
    }
}
//Xây dựng lớp chi tiết phiếu nhập
class ChiTietPhieuNhap extends PhieuNhap{
//Các thuộc tính
    int ma_sanpham;
    String ten_sanpham;
    int soluong;
    String hansudung;
//Các phương thức
    //phương thức nhập tt
    void nhapthongtin_sanpham(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham la: \n");
        System.out.println("Nhap ma san pham la: \n");
        ma_sanpham = scan.nextInt();
        System.out.println("Nhap ten san pham la: \n");
        ten_sanpham = scan.nextLine();
        System.out.println("Nhap so luong la: \n");
        soluong = scan.nextInt();
        System.out.println("Nhap han su dung la: \n");
        hansudung = scan.nextLine();
    }
    //Phương thwucs xuất tt
    void xuatthongtin_sanpham(){
        System.out.println("Xuat thong tin san pham la: \n");
        System.out.println("Ma san pham la: \n"+ma_sanpham);
        System.out.println("Ten san pham la: \n"+ten_sanpham);
        System.out.println("So luong la: \n"+soluong);
        System.out.println("Han su dung la: \n"+hansudung);
    }
}