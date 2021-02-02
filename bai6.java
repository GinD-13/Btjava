import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        int a, i=1;
        long giai_thua = 1;

        //Nhập số nguyên dương là
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương là: ");
        a = scan.nextInt();
        scan.close();
        do{
            giai_thua *= i;
            i++;
        }while(i<=a);
        System.out.println("Giai thua của "+ a +" là: " +giai_thua);
    }
}
