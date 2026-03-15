import java.util.Scanner;

public class MatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        int a[][] = new int[10][10];

        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Enter matrix elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}