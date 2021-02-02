import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, sum = 0;
        while(sum < 100){
            //Nhập số nguyên
            System.out.println("Nhập số nguyên là: ");
            a = scan.nextInt();
            sum +=a;
        }
        System.out.println("Tổng là: " +sum);
    }
}
