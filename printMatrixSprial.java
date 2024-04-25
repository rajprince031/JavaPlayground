import java.util.*;
public class printMatrixSprial {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row of matrix");
        int n = sc.nextInt();
        System.out.println("Enter Column of matrix");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // taking four pointer top(0),bottom(size of row),left,right;
        int top = 0 , bottom = n-1 , left = 0 , right = m-1;
        // take direction 
        // d == 0 means left to right
        // d == 1 means top to down
        // d == 2 means right to left
        // d == 3 means bottom to up
        int d = 0;
        while(top<=bottom && left<=right)
        {
            if(d==0)
            {
                for(int i=left;i<=right;i++)
                System.out.print(arr[top][i]+" ");
                top++;
                d++;
            }
            else if(d==1)
            {
                for(int i=top;i<=bottom;i++)
                System.out.print(arr[i][right]+" ");
                right--;
                d++;
            }
            else if(d==2)
            {
                for(int i=right;i>=left;i--)
                System.out.print(arr[bottom][i]+" ");
                bottom--;
                d++;
            }
            else if(d==3)
            {
                for(int i=bottom;i>=top;i--)
                System.out.print(arr[i][left]+" ");
                left++;
                d=0;
            }
        }

    }
}
