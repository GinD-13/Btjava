import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        //nhập vào dãy số n
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào dãy số n là: ");
        int n = scan.nextInt();
        int sum = 0;
        float tbc =0 ;
        //tính tổng và trung bình cộng
        for(int i = 1; i <= n ; i++){
            sum += i ;
            tbc = sum/n;            
        }
        //in ra màn hình console tổng và trung bình cộng
        System.out.println("Tổng của dãy "+n+" là: " + sum);
        System.out.println("Trung bình cộng của dãy n là: "+tbc);
    }
}
