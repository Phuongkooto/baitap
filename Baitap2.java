    
import java.util.Scanner;
public class Baitap {
    public static void main(String[] args) {
        Scanner Phuogn = new Scanner(System.in);
        System.out.print("Số nguyên thứ nhất: ");
        int b = Phuogn.nextInt();

        System.out.print("Số nguyên thứ hai: ");
        int a = Phuogn.nextInt();
        int cong = b + a;
        int tru = b - a;
        int nhan = b * a;
        int chia = b / a;
        int chiaa = b % a;

        System.out.println("Kết quả của phép cộng: " + cong);
        System.out.println("Kết quả của phép trừ: " + tru);
        System.out.println("Kết quả của phép nhân: " + nhan);
        System.out.println("Kết quả của phép chia: " + chia);
        System.out.println("Kết quả của phép chia lấy dư: " + chiaa);
    }
}
