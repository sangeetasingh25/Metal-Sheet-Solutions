import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,sum=0;
        int a[][] = new int[10][10];

        System.out.print("Enter rows and columns: ");
        r=sc.nextInt();
        c=sc.nextInt();

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                sum += a[i][j];

        System.out.println("Sum = "+sum);
    }
}