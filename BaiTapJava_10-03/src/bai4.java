import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
        sv.tinhDiemtb();
    }
}
class SinhVien{
    //khai báo dữ liệu
    String hoten, gioitinh,lop;
    int ngaysinh;
    float diemtoan, diemly, diemhoa, dtb;
    //hàm nhập
    void nhap(){
        Scanner scan = new Scanner(System.in);
        //Nhập họ và tên
        System.out.println("Nhập họ và tên là:");
        hoten = scan.nextLine();
        //Nhập ngày sinh
        System.out.println("Nhập ngày sinh là:");
        ngaysinh = scan.nextInt();
        //Nhập vào giới tính
        System.out.println("Nhập vào giới tính là:");
        gioitinh = scan.nextLine();
        //Nhập vào lớp
        System.out.println("Nhập lớp là:");
        lop = scan.nextLine();
        //Nhập vào điểm toán 
        System.out.println("Nhập vào điểm toán là: ");
        diemtoan = scan.nextInt();
        //Nhập vào điểm lý
        System.out.println("Nhập vào điểm lý là: ");
        diemly = scan.nextInt();
        //Nhập vào điểm hóa là
        System.out.println("Nhập vào điểm hóa là: ");
        diemhoa = scan.nextInt();
    }
    void tinhDiemtb(){
        dtb = (diemtoan+diemhoa+diemly)/3;
        System.out.println("Điểm trung bình là: "+dtb);
    }
    void xuat(){
        System.out.println("Họ tên sinh viên là: "+hoten);
        System.out.println("Ngày sinh của sinh viên là: "+ngaysinh);
        System.out.println("Giới tính của sinh viên là: "+gioitinh);
        System.out.println("Lớp của sinh viên là: "+lop);
        System.out.println("Điểm toán của sinh viên là: "+diemtoan);
        System.out.println("Điểm lý của sinh viên là:" +diemly);
        System.out.println("Điểm hóa của sinh viên là: "+diemhoa);
        }
}
