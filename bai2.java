import java.util.Scanner;
public class bai2 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            //Nhập vào số nguyên
            System.out.println("Nhập vào số nguyên là: ");
            int a = scan.nextInt();
            //xét tính chẵn lẻ của số đã nhập
            if( a % 2 == 0){
                System.out.println(a + " là số chẵn");
            }else{
                System.out.println(a + " là số lẻ");
            }
       }
}
