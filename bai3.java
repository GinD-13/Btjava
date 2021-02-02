import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Nhập vào tên của bạn
        System.out.println("Nhập vào tên của bạn là: ");
        String name = scan.nextLine();
        //Nhập năm sinh của bạn
        System.out.println("Nhập năm sinh của bạn là: ");
        int age = scan.nextInt();
        //
        if(age >= 0 && age < 16){
            System.out.println("Bạn "+name+" ở độ tuổi vị thành niên");
        }else if(age >= 16 && age < 18){
            System.out.println("Bạn "+name+" ở độ tuổi trưởng thành");
        }else{
            System.out.println("Bạn đã già");
        }
    }
}
