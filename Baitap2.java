    
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        Scanner Phuogn = new Scanner(System.in);
        System.out.print("SO NGUYEN THU NHAT: ");
        int b = Phuogn.nextInt();

        System.out.print("SO NGUYEN THU HAI: ");
        int a = Phuogn.nextInt();
        int cong = b + a;
        int tru = b - a;
        int nhan = b * a;
        int chia = b / a;
        int chiaa = b % a;

        System.out.println("CONG: " + cong);
        System.out.println("TRU: " + tru);
        System.out.println("NHAN " + nhan);
        System.out.println("CHIA: " + chia);
        System.out.println("CHIA LAY PHAN DU " + chiaa);
    }
}
