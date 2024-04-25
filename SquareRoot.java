import java.util.*;

public class SquareRoot
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();
        Double low =0.0;
        Double high = n;
        while(low<=high)
        {
            Double mid = low + (high-low)/2;
            if(mid*mid == n)
            {
                System.out.println("Square Root :- " + mid);
                break;
            }
            else if(mid*mid > n)
            {
                high = mid;
            } 
            else
            {
                low = mid;
            }
        }
    }
}

