import java.util.Scanner;
public class baitapuocboi {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int BSCNN(int a, int b) {
        return (a * b) / UCLN (a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số nguyên dương a và b
        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();
        
        // Tính ƯSCLN và BSCNN
        int gcdResult = UCLN(a, b);
        int lcmResult = BSCNN(a, b);

        // In ra kết quả
        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + gcdResult);
        System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b + " là: " + lcmResult);

        
    }
}


