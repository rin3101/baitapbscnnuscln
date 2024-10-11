import java.util.Scanner;
public class baitapsochinhphuong {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  m và n 
        System.out.print("Nhap so M sao cho (m < n): ");
        int m = scanner.nextInt();
        System.out.print("Nhap so n sao cho (m < n): ");
        int n = scanner.nextInt();

        // tim gia tri trn va duoi 
        int duoi = (int) Math.ceil(Math.sqrt(m));  
        int tren = (int) Math.floor(Math.sqrt(n));   
        // dem so chinh phuong thoa man dieu kien
        int count= 0;
        System.out.println("cac so chinh phuong can tim trong [" + m + ", " + n + "]:");
        for (int k = duoi; k <= tren; k++) {
            int square = k * k;
            System.out.print(square + " ");
            count++;
            
        }
    }
}

    
