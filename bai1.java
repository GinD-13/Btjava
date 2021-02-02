import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Nhập vào 2 sô nguyên trong màn hình console
        System.out.println("Nhập vào số nguyên a là: ");
        int a = scan.nextInt();
        System.out.println("Nhập vào số nguyên b là: ");
        int b = scan.nextInt();
        //tính tổng, hiệu, tích, thương, chia lấy dư
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        float thuong = a / b;
        float chialaydu = a % b;
        //in ra màn hình console
        System.out.println("Tổng là:" + tong); 
        System.out.println("Hiệu là:" + hieu);
        System.out.println("Tích là:" + tich);
        System.out.println("Thương là:" + thuong);
        System.out.println("Chia lấy dư là:" + chialaydu);
        //-------------------------------------------------
        //so sánh hai số a và b
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số bé nhất là: " + min);

    }
}
