import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int hoa = 0, thuong = 0, so = 0;
        //Nhập vào chuỗi ký tự
        System.out.println("Nhập vào chuỗi ký tự là:");
        String name = scan.nextLine();
        //tạo hàm for để đếm các ký tự trong chuỗi
        for(int i=0; i<name.length();i++){
        //check các ký tự chữ số, chữ hoa , chữ thường
            char check = name.charAt(i);
            if(Character.isDigit(check)){
                so++;
            }else if(Character.isUpperCase(check)){
                hoa++;
            }else if(Character.isLowerCase(check)){
                thuong++;
            }
        }
        System.out.println("Ký tự thường: " +thuong);
        System.out.println("Ký tự hoa: " +hoa);
        System.out.println("Ký tự số: " +so);
    }
}
