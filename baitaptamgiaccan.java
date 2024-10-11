import java.util.Scanner;
public class baitaptamgiaccan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("chieu cao tam giac la h=: ");
        int h = scanner.nextInt();
        // in ra hang tam giac
        for (int i = 1; i <= h; i++) {
            // in dau *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

    
