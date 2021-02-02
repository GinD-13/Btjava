import java.util.Scanner;
public class bai10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        do{
            System.out.println("Nhập một chuỗi bất kỳ: ");
            s = scan.nextLine();
        }while(s.length() > 800);
        System.out.println("Nhập 1 ký tự bất kỳ là:");
        char a =scan.next().charAt(0);
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            char check = s.charAt(i);
            if(check ==a){
                dem++;
            }
        }
        if(dem>0){
            System.out.println("Số lần xuất hiện của ký tự "+a+" trong chuỗi " +s+" là: "+ dem +" lần");
        }else{
            System.out.println("Không xuất hiện ký tự "+a+" trong chuỗi "+s);
        }
    }
}
